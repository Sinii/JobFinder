package com.example.usecase.exchangerates

import com.example.rates.JobItem
import kotlinx.coroutines.runBlocking
import org.junit.Test

class DoConvertExchangeRateToRateItemUseCaseTest {

    @Test
    fun `check one exchangeRateItem`() {
        val useCase = DoConvertExchangeRateToRateItemUseCase()
        val exchangeRateItem = JobItem("EUR", "company", 1.0, null, null)
        val rate = 2.0
        runBlocking {
            val result = useCase
                .doWork(
                    DoConvertExchangeRateToRateItemUseCase.Params(
                        exchangeRateItem.location,
                        rate,
                        exchangeRateItem.jobArticle
                    )
                )
            assert(result.jobItem.location == rate * exchangeRateItem.location)
        }
    }
}