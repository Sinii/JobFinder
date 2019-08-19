package com.anton.joblistfeature.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.anton.joblistfeature.R
import com.anton.joblistfeature.databinding.ItemJobBinding
import com.example.base.adapters.BaseAdapter
import com.example.interfaces.JobItemClickListener
import com.example.jobs.JobItem

class JobsAdapter(
    rateList: ArrayList<JobItem>,
    private val listener: JobItemClickListener
) :
    BaseAdapter<JobViewHolder, JobItem>(rateList) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val binding = DataBindingUtil.inflate<ItemJobBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_job,
            parent,
            false
        )
        return JobViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}