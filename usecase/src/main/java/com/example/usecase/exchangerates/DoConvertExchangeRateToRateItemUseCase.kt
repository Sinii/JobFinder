package com.example.usecase.exchangerates

import com.example.base.usecase.BaseUseCase
import com.example.rates.JobItem
import javax.inject.Inject

class DoConvertExchangeRateToRateItemUseCase
@Inject constructor() :
    BaseUseCase<DoConvertExchangeRateToRateItemUseCase.Params, DoConvertExchangeRateToRateItemUseCase.Result>() {
    override suspend fun doWork(params: Params): Result {

        return Result(JobItem(params.currencyCode, params.currencyCode, params.rateViaBaseCurrency, null))
    }

    class Params(val amount: String, val rateViaBaseCurrency: String, val currencyCode: String)
    class Result(val jobItem: JobItem)
}