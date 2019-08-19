package com.example.jobdescriptionfeature.ui

import android.os.Build
import android.text.Html
import android.text.Spanned
import androidx.lifecycle.MutableLiveData
import com.example.base.viewmodel.BaseViewModel
import com.example.rates.JobItem
import javax.inject.Inject

class JobDescriptionViewModel
@Inject constructor(
) : BaseViewModel() {
    var jobDescription: JobItem? = null

    val title = MutableLiveData<String>()
    val companyName = MutableLiveData<String>()
    val location = MutableLiveData<String>()
    val description = MutableLiveData<Spanned>()
    val companyImageUrl = MutableLiveData<String>()

    override fun doAutoMainWork() {
        jobDescription?.let {
            title.postValue(it.jobArticle)
            companyImageUrl.postValue(it.companyLogoUrl)
            companyName.postValue(it.company)
            location.postValue(it.location)
            description.postValue(
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                    Html.fromHtml(it.description, Html.FROM_HTML_MODE_COMPACT)
                else
                    Html.fromHtml(it.description)
            )
        }
    }
}