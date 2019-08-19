package com.example.interfaces

import android.view.View
import com.example.jobs.JobItem

interface JobItemClickListener {

    fun onClick(job: JobItem, sharedView: View?)
}