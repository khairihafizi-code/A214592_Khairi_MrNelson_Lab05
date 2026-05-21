package com.example.a214592_khairi_mrnelson_lab05

import android.app.Application
import com.example.a214592_khairi_mrnelson_lab05.data.OrderDatabase
import com.example.a214592_khairi_mrnelson_lab05.data.OrderRepository

class CupcakeApplication : Application() {
    val database by lazy { OrderDatabase.getDatabase(this) }
    val repository by lazy { OrderRepository(database.orderDao()) }
}