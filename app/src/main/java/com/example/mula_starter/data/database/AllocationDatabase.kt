package com.example.mula_starter.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mula_starter.data.database.model.InitialBalance

@Database(entities = [(InitialBalance::class)], version = 1)
abstract class AllocationDatabase : RoomDatabase(){
    abstract fun allocationDao(): AllocationDao
}