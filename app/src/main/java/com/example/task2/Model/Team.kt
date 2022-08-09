package com.example.task2.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    val id: Long,
    val abbr: String,
    val logoLight: String
): Parcelable