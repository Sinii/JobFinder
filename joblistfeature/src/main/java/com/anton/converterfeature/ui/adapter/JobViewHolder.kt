package com.anton.converterfeature.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.anton.converterfeature.databinding.ItemJobBinding
import com.example.rates.JobItem
import com.example.utils.loadImage
import kotlinx.android.synthetic.main.item_job.view.*

class JobViewHolder(binding: ItemJobBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: JobItem?) {
        with(itemView) {
            if (item != null) {
                companyImageView.loadImage(item.companyLogoUrl)
                jobArticleTextView.text = item.jobArticle
                companyNameTextView.text = item.company
                locationTextView.text = item.location
            }
        }
    }
}