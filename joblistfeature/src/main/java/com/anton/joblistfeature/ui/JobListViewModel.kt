package com.anton.joblistfeature.ui

import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.MutableLiveData
import com.example.base.viewmodel.BaseViewModel
import com.example.base.viewmodel.ViewModelCommands
import com.example.rates.JobItem
import com.example.usecase.exchangerates.GetJobItemsUseCase
import com.example.utils.dLog
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import javax.inject.Inject

class JobListViewModel
@Inject constructor(
    private val getJobItemsUseCase: GetJobItemsUseCase
) : BaseViewModel() {

    val jobsList = MutableLiveData<List<JobItem>>()
    val showNoItemsStub = MutableLiveData(GONE)
    private var requestJob: Job? = null
    private var debounceJob: Job? = null

    override fun restoreViewModel() {
        if (jobsList.value?.isNotEmpty() == true) {
            viewModelCommands.postValue(ViewModelCommands.DataLoaded)
        } else {
            doAutoMainWork()
        }
    }

    override fun doAutoMainWork() {
        viewModelCommands.postValue(ViewModelCommands.DataStartLoading)
        "doAutoMainWork".dLog()
        requestJob?.cancel()
        requestJob = updateItemsJob()
    }

    private fun updateItemsJob() = doWork {
        val jobItems = getJobItemsUseCase
            .doWork(GetJobItemsUseCase.Params(
                "android developer",
                null
            ))
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

    fun jobDescriptionChanged(item: JobItem, amountValue: Double) {
        "item = ${item.company} old location = ${item.location} location = $amountValue".dLog()
        debounceJob?.cancel()
        debounceJob = doWork {
            delay(DELAY_DEBOUNCE)
        }
    }

    companion object {
        const val DELAY_DEBOUNCE = 300L
    }
}