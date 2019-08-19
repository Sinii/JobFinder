package com.anton.joblistfeature.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.anton.joblistfeature.R

class JobListFragmentDirections private constructor() {
    companion object {
        fun actionJobListFragmentToJobDescriptionFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_jobListFragment_to_jobDescriptionFragment)
    }
}
