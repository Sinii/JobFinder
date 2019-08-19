package com.example.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String?) {
    view.loadImage(url)
}

@BindingAdapter("setDrawableResource")
fun setDrawableResource(view: ImageView, resource: Int?) {
    if (resource != null) {
        view.setImageDrawable(view.context.getDrawable(resource))
    }
}