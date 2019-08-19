package com.anton.joblistfeature.ui

import android.view.View
import android.view.View.GONE
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.jobs.JobItem
import com.example.usecase.job.GetJobItemsUseCase
import io.mockk.every
import io.mockk.mockkClass
import io.mockk.mockkStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ConverterViewModelTest {
    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @Before
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        mockkStatic(Dispatchers::class)
        every {
            Dispatchers.IO
        } returns Dispatchers.Main
    }

    @Test
    fun `test no items state default `() {
        val getCalculatedRateItemsUseCase = mockkClass(GetJobItemsUseCase::class)
        every {
            runBlocking {
                getCalculatedRateItemsUseCase.doWork(any())
            }
        } returns GetJobItemsUseCase.Result(emptyList(), null)
        val vm =
            JobListViewModel(getCalculatedRateItemsUseCase)
        assert(vm.showNoItemsStub.value == View.GONE)
    }

    @Test
    fun `test no items state`() {
        val getCalculatedRateItemsUseCase = mockkClass(GetJobItemsUseCase::class)
        every {
            runBlocking {
                getCalculatedRateItemsUseCase.doWork(
                    any()
                )
            }
        } returns GetJobItemsUseCase.Result(emptyList<JobItem>(), null)
        val vm =
            JobListViewModel(getCalculatedRateItemsUseCase)
        vm.doAutoMainWork()
        assert(vm.showNoItemsStub.value == View.VISIBLE)
    }


    @Test
    fun `one item list, hide no items stub`() {
        val items = listOf(JobItem("asd", "asd", 0.0, null, null))
        val getCalculatedRateItemsUseCase = mockkClass(GetJobItemsUseCase::class)
        every {
            runBlocking {
                getCalculatedRateItemsUseCase
                    .doWork(any())
            }
        } returns GetJobItemsUseCase.Result(items, null)
        val vm =
            JobListViewModel(getCalculatedRateItemsUseCase)
        vm.doAutoMainWork()
        assert(vm.showNoItemsStub.value == GONE)
    }

    @Test
    fun `one item list, check items`() {
        val items = listOf(JobItem("asd", "asd", 0.0, null, null))
        val getCalculatedRateItemsUseCase = mockkClass(GetJobItemsUseCase::class)
        every {
            runBlocking {
                getCalculatedRateItemsUseCase
                    .doWork(any())
            }
        } returns GetJobItemsUseCase.Result(items, null)
        val vm =
            JobListViewModel(getCalculatedRateItemsUseCase)
        vm.doAutoMainWork()

        print(vm.showNoItemsStub.value)
        assert(vm.jobsList.value?.isEmpty() == false)
    }
}