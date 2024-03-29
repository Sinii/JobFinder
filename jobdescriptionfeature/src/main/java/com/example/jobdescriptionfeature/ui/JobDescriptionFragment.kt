package com.example.jobdescriptionfeature.ui

import android.text.method.LinkMovementMethod
import com.example.base.di.ViewModelFactory
import com.example.base.ui.BaseFragment
import com.example.jobdescriptionfeature.R
import com.example.jobdescriptionfeature.databinding.FragmentJobDescriptionBinding
import com.example.jobs.JobItem


class JobDescriptionFragment : BaseFragment<FragmentJobDescriptionBinding, ViewModelFactory>() {

    override fun provideListOfViewModels(): Array<Class<*>> = arrayOf(
        JobDescriptionViewModel::class.java
    )

    override fun provideActionsBinding(): (FragmentJobDescriptionBinding, Set<*>) -> Unit =
        { binding, viewModelList ->
            viewModelList.forEach { viewModel ->
                when (viewModel) {
                    is JobDescriptionViewModel -> {
                        viewModel.jobDescription =
                            arguments?.getParcelable<JobItem>(JobItem::class.toString())
                        binding.vm = viewModel
                        binding.descriptionTextView.movementMethod = LinkMovementMethod.getInstance()
                    }
                }
            }
        }

    override fun provideLayout() = R.layout.fragment_job_description

    override fun provideLifecycleOwner() = this
}