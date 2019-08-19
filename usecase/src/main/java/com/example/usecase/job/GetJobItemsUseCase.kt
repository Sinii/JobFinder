package com.example.usecase.job

import com.example.base.usecase.BaseUseCase
import com.example.jobs.JobItem
import com.example.utils.dLog
import javax.inject.Inject

class GetJobItemsUseCase
@Inject constructor(
    private val getJobListUseCase: GetJobListUseCase
) : BaseUseCase<GetJobItemsUseCase.Params, GetJobItemsUseCase.Result>() {
    override suspend fun doWork(params: Params): Result {
        val result = getJobListUseCase
            .doWork(
                GetJobListUseCase.Params(
                    params.description,
                    params.location
                )
            )
        val jobs = result
            .jobs
            ?.map {
                return@map JobItem(
                    it.title,
                    it.company,
                    it.location,
                    it.company_logo,
                    it.description,
                    it.how_to_apply
                )
            }
        "GetJobItemsUseCase jobs = $jobs ".dLog()

        return Result(jobs, result.errorMessage)
    }

    class Params(val description: String, val location: String?)
    class Result(val exchangeRatesItems: List<JobItem>?, val errorMessage: String?)
}