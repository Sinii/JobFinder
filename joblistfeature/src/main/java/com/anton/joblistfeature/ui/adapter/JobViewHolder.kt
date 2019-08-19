package com.anton.joblistfeature.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.anton.joblistfeature.databinding.ItemJobBinding
import com.example.interfaces.JobItemClickListener
import com.example.rates.JobItem
import com.example.utils.loadImage
import kotlinx.android.synthetic.main.item_job.view.*

class JobViewHolder(binding: ItemJobBinding, private val listener: JobItemClickListener) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: JobItem?) {
        with(itemView) {
            if (item != null) {
                jobItemLayout.setOnClickListener {
                    listener.onClick(item, companyImageView)
                }
                companyImageView.loadImage(item.companyLogoUrl)
                jobArticleTextView.text = item.jobArticle
                companyNameTextView.text = item.company
                locationTextView.text = item.location
            }
        }
    }
}