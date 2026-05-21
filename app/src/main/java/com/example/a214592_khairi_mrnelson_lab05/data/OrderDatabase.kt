package com.example.a214592_khairi_mrnelson_lab05.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [OrderEntity::class], version = 1, exportSchema = false)
abstract class OrderDatabase : RoomDatabase() {
    abstract fun orderDao(): OrderDao

    companion object {
        @Volatile
        private var Instance: OrderDatabase? = null

        fun getDatabase(context: Context): OrderDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, OrderDatabase::class.java, "cupcake_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}