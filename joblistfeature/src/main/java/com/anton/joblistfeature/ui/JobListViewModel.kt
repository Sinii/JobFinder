package com.anton.joblistfeature.ui

import android.text.Editable
import android.text.TextWatcher
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.MutableLiveData
import com.example.base.viewmodel.BaseViewModel
import com.example.base.viewmodel.ViewModelCommands
import com.example.jobs.JobItem
import com.example.usecase.job.GetJobItemsUseCase
import com.example.utils.dLog
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import javax.inject.Inject

class JobListViewModel
@Inject constructor(
    private val getJobItemsUseCase: GetJobItemsUseCase
) : BaseViewModel() {

    val jobPosition = MutableLiveData("Android developer")
    val jobsList = MutableLiveData<List<JobItem>>()
    val showNoItemsStub = MutableLiveData(GONE)
    val jobPositionChangedListener = MutableLiveData<TextWatcher>(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            "afterTextChanged ".dLog()
            textChangedDebounceJob?.cancel()
            textChangedDebounceJob = doWork {
                delay(DELAY_DEBOUNCE)
                requestJob?.cancel()
                requestJob = updateItemsJob()
            }
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
    })

    private var requestJob: Job? = null
    private var textChangedDebounceJob: Job? = null

    override fun restoreViewModel() {
        if (jobsList.value?.isNotEmpty() == true) {
            viewModelCommands.postValue(ViewModelCommands.DataLoaded)
        } else {
            doAutoMainWork()
        }
    }

    override fun doAutoMainWork() {
        "doAutoMainWork".dLog()
        requestJob?.cancel()
        requestJob = updateItemsJob()
    }

    private fun updateItemsJob() = doWork {
        "updateItemsJob ".dLog()
        viewModelCommands.postValue(ViewModelCommands.DataStartLoading)

        val jobItems = getJobItemsUseCase
            .doWork(
                GetJobItemsUseCase.Params(
                    jobPosition.value ?: "Android developer",
                    null
                )
            )
        val exchangeRatesItems = jobItems.exchangeRatesItems
        val hasItems = !exchangeRatesItems.isNullOrEmpty()
        if (hasItems) {
            showNoItemsStub.postValue(GONE)
            jobsList.postValue(exchangeRatesItems)
        } else {
            showNoItemsStub.postValue(VISIBLE)
            showError(jobItems.errorMessage)
        }
        viewModelCommands.postValue(ViewModelCommands.DataLoaded)
    }

    companion object {
        const val DELAY_DEBOUNCE = 1000L
    }
}