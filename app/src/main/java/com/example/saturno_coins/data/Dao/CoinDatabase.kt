package com.example.saturno_coins.data.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.service.retrofit.domain.model.CoinItem

@Database(entities = [CoinItem::class], version = 1)
abstract class CoinDatabase : RoomDatabase() {
    abstract fun coinDao(): CoinDAO
}
