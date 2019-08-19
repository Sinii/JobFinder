package com.example.jobs

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class JobItem(
    val jobArticle: String,
    val company: String,
    val location: String?,
    val companyLogoUrl: String?,
    val description: String?,
    val howToApply: String?
) : Parcelable