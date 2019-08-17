package com.anton.converterfeature.ui

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anton.converterfeature.R
import com.anton.converterfeature.databinding.FragmentJobListBinding
import com.anton.converterfeature.ui.adapter.JobsAdapter
import com.ethanhua.skeleton.RecyclerViewSkeletonScreen
import com.ethanhua.skeleton.Skeleton
import com.example.base.di.ViewModelFactory
import com.example.base.ui.BaseFragment
import com.example.base.viewmodel.ViewModelCommands


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
                        val adapter = JobsAdapter(ArrayList())
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
    }
}