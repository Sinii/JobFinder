package com.example.utils

import android.text.TextWatcher
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatEditText
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

@BindingAdapter("textChangedListener")
fun setTextChangedListener(appCompatEditText: AppCompatEditText, listener: TextWatcher?) {
    "setTextChangedListener $listener".dLog()
    if (listener != null) {
        "setTextChangedListener ".dLog()
        appCompatEditText.addTextChangedListener(listener)
    }
}