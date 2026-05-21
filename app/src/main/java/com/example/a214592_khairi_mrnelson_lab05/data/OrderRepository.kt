package com.example.a214592_khairi_mrnelson_lab05.data

import kotlinx.coroutines.flow.Flow

class OrderRepository(private val orderDao: OrderDao) {
    fun getAllOrdersStream(): Flow<List<OrderEntity>> = orderDao.getAllOrders()

    suspend fun insertOrder(order: OrderEntity) {
        orderDao.insert(order)
    }
}