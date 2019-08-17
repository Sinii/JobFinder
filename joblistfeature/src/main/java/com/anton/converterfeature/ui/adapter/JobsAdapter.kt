package com.anton.converterfeature.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.anton.converterfeature.R
import com.anton.converterfeature.databinding.ItemJobBinding
import com.example.base.adapters.BaseAdapter
import com.example.rates.JobItem

class JobsAdapter(rateList: ArrayList<JobItem>) :
    BaseAdapter<JobViewHolder, JobItem>(rateList) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val binding = DataBindingUtil.inflate<ItemJobBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_job,
            parent,
            false
        )
        return JobViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}