package com.example.usecase.exchangerates

import com.example.rates.JobItem
import io.mockk.every
import io.mockk.mockkClass
import kotlinx.coroutines.runBlocking
import org.junit.Test

class GetJobItemsUseCaseTest {

    @Test
    fun `no errors`() {
        val doConvertExchangeRateToRateItemUseCase = DoConvertExchangeRateToRateItemUseCase()
        val getExchangeRateToRateItemUseCase = mockkClass(GetJobListUseCase::class)
        val exchangeRateItem = JobItem("EUR", "company", 1.0, null, null)
        val exchangeRate = emptyMap<String, Double>()
        every {
            runBlocking {
                getExchangeRateToRateItemUseCase.doWork(any())
            }
        } returns GetJobListUseCase.Result(exchangeRate, null)
        val useCase =
            GetJobItemsUseCase(getExchangeRateToRateItemUseCase, doConvertExchangeRateToRateItemUseCase)
        runBlocking {
            val result = useCase.doWork(GetJobItemsUseCase.Params(exchangeRateItem))
            assert(result.errorMessage == null)
        }
    }

    @Test
    fun `no items`() {
        val doConvertExchangeRateToRateItemUseCase = DoConvertExchangeRateToRateItemUseCase()
        val getExchangeRateToRateItemUseCase = mockkClass(GetJobListUseCase::class)
        val exchangeRateItem = JobItem("EUR", "company", 1.0, null, null)
        val exchangeRate = emptyMap<String, Double>()
        every {
            runBlocking {
                getExchangeRateToRateItemUseCase.doWork(any())
            }
        } returns GetJobListUseCase.Result(exchangeRate, null)
        val useCase =
            GetJobItemsUseCase(getExchangeRateToRateItemUseCase, doConvertExchangeRateToRateItemUseCase)
        runBlocking {
            val result = useCase.doWork(GetJobItemsUseCase.Params(exchangeRateItem))
            assert(result.exchangeRatesItems == listOf(exchangeRateItem))
        }
    }


    @Test
    fun `one item`() {
        val doConvertExchangeRateToRateItemUseCase = DoConvertExchangeRateToRateItemUseCase()
        val getExchangeRateToRateItemUseCase = mockkClass(GetJobListUseCase::class)
        val exchangeRateItem = JobItem("EUR", "EUR", 1.0, null, null)
        val exchangeRate = mapOf(Pair(exchangeRateItem.jobArticle, exchangeRateItem.location))
        every {
            runBlocking {
                getExchangeRateToRateItemUseCase.doWork(any())
            }
        } returns GetJobListUseCase.Result(exchangeRate, null)
        val useCase =
            GetJobItemsUseCase(getExchangeRateToRateItemUseCase, doConvertExchangeRateToRateItemUseCase)
        runBlocking {
            val result = useCase.doWork(GetJobItemsUseCase.Params(exchangeRateItem))
            assert(result.exchangeRatesItems == listOf(exchangeRateItem, exchangeRateItem))
        }
    }
}