package com.example.jobdescriptionfeature.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.jobs.JobItem
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

 class JobDescriptionViewModelTest {
    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `check job details data`() {
       val job = JobItem(
           "1","2", "3", "4", "5", "6"
       )
        val vm = JobDescriptionViewModel()
        vm.jobDescription = job
        vm.doAutoMainWork()
        Assert.assertTrue(vm.title.value == job.jobArticle)
        Assert.assertTrue(vm.companyName.value == job.company)
        Assert.assertTrue(vm.location.value == job.location)
        Assert.assertTrue(vm.companyImageUrl.value == job.companyLogoUrl)

    }

}