package com.example.usecase.job

import com.example.base.usecase.BaseUseCase
import com.example.jobs.Job
import com.example.repository.jobs.JobsRepository
import javax.inject.Inject

class GetJobListUseCase
@Inject constructor(
    private val jobsRepository: JobsRepository
) : BaseUseCase<GetJobListUseCase.Params, GetJobListUseCase.Result>() {
    override suspend fun doWork(params: Params): Result {
        val result = jobsRepository
            .doWork(JobsRepository.Params(params.description, params.location))
        val rates = result.jobs
        val errorMessage = result.error?.error
        return Result(rates, errorMessage)
    }

    class Params(val description: String, val location: String?)
    class Result(val jobs: List<Job>?, val errorMessage: String?)
}