package com.example.a214592_khairi_mrnelson_lab05.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(order: OrderEntity)

    @Query("SELECT * FROM order_table ORDER BY id DESC")
    fun getAllOrders(): Flow<List<OrderEntity>>
}