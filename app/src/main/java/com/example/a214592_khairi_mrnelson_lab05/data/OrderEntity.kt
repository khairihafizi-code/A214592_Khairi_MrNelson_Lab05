package com.example.a214592_khairi_mrnelson_lab05.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order_table")
data class OrderEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val quantity: Int,
    val flavor: String,
    val date: String,
    val price: String
)