package com.anton.joblistfeature.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anton.joblistfeature.R
import com.anton.joblistfeature.databinding.FragmentJobListBinding
import com.anton.joblistfeature.ui.adapter.JobsAdapter
import com.ethanhua.skeleton.RecyclerViewSkeletonScreen
import com.ethanhua.skeleton.Skeleton
import com.example.base.di.ViewModelFactory
import com.example.base.ui.BaseFragment
import com.example.base.viewmodel.ViewModelCommands
import com.example.interfaces.JobItemClickListener
import com.example.jobdescriptionfeature.ui.JobDescriptionFragmentArgs
import com.example.jobs.Job
import com.example.rates.JobItem
import com.example.utils.toSharedPair


class JobListFragment : BaseFragment<FragmentJobListBinding, ViewModelFactory>() {
    private var skeletonScreen: RecyclerViewSkeletonScreen? = null

    override fun provideListOfViewModels(): Array<Class<*>> = arrayOf(
        JobListViewModel::class.java
    )

    override fun busEvents(
        command: ViewModelCommands,
        viewModelList: Set<*>,
        binding: FragmentJobListBinding
    ): Boolean {
        viewModelList.forEach { viewModel ->
            when {
                command is ViewModelCommands.DataStartLoading
                        && viewModel is JobListViewModel -> {
                    skeletonScreen?.show()
                }
                command is ViewModelCommands.DataLoaded
                        && viewModel is JobListViewModel -> {
                    skeletonScreen?.hide()
                }
            }
        }
        return super.busEvents(command, viewModelList, binding)
    }

    override fun provideActionsBinding(): (FragmentJobListBinding, Set<*>) -> Unit =
        { binding, viewModelList ->
            viewModelList.forEach { viewModel ->
                when (viewModel) {
                    is JobListViewModel -> {
                        val layoutManager =
                            LinearLayoutManager(
                                this@JobListFragment.requireContext(),
                                RecyclerView.VERTICAL,
                                false
                            )
                        val adapter = JobsAdapter(
                            ArrayList(), object : JobItemClickListener {
                                @SuppressLint("ResourceType")
                                override fun onClick(job: JobItem, sharedView: View?) {
                                    val extras = if (sharedView != null)
                                        FragmentNavigatorExtras(
                                            sharedView toSharedPair SHARED_COPANY_LOGO_VIEW_KEY
                                        )
                                    else
                                        null
                                    val bundle = Bundle()
                                        .apply {
                                            putParcelable(JobItem::class.toString(), job)
                                        }
                                    if (extras != null) {
                                        findNavController()
                                            .navigate(
                                                R.id.action_jobListFragment_to_jobDescriptionFragment,
                                                bundle,
                                                null,
                                                extras
                                            )
                                    } else {
                                        findNavController()
                                            .navigate(
                                                R.id.action_jobListFragment_to_jobDescriptionFragment,
                                                bundle
                                            )
                                    }
                                }
                            })
                        binding.jobsRecyclerView.layoutManager = layoutManager
                        binding.jobsRecyclerView.adapter = adapter

                        viewModel.jobsList.observe(this, Observer { list ->
                            adapter.addItems(list)
                        })
                        skeletonScreen = Skeleton
                            .bind(binding.jobsRecyclerView)
                            .adapter(adapter)
                            .load(R.layout.item_job_skeleton)
                            .angle(0)
                            .color(R.color.shineLoadingColor)
                            .count(STUB_ITEMS_COUNT)
                            .show()
                    }
                }
            }
        }

    override fun provideLayout() = R.layout.fragment_job_list

    override fun provideLifecycleOwner() = this

    companion object {
        const val STUB_ITEMS_COUNT = 15
        const val SHARED_COPANY_LOGO_VIEW_KEY = "company_image_transition"
    }
}