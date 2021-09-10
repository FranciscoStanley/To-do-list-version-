package com.example.todolist.model

import android.service.quicksettings.Tile

data class Task(
    val title: String,
    val hour: String,
    val date: String,
    val id: Int = 0
)
