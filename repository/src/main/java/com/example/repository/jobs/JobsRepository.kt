package com.example.repository.jobs

import com.example.ApiError
import com.example.base.repository.BaseRepository
import com.example.jobs.Job
import com.example.network.retrofit.RetrofitJobList
import javax.inject.Inject

class JobsRepository
@Inject constructor(
    private val retrofitJobList: RetrofitJobList
) : BaseRepository<JobsRepository.Params, JobsRepository.Result>() {
    override suspend fun doWork(params: Params): Result {
        val response =
            retrofitJobList.getJobListAsync(params.description, params.location)
        val result = response.body()
        val error = response.errorBody()
        return Result(result, getError(error))
    }

    class Params(val description: String, val location: String?)
    class Result(val jobs: List<Job>?, val error: ApiError?)
}