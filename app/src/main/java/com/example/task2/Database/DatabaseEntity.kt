package com.example.task2.Database

import androidx.room.Entity

@Entity
data class DatabaseEntity(
    val id: Long,
    val abbr: String,
    val logoLight: String
)