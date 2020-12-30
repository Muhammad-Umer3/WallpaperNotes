package com.muhammad.umer.wallpapernotes.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity(tableName = "tasks")
data class Task(@PrimaryKey val id : String = "", val task : String = "", val completed: Boolean = false, val date : String = "")



