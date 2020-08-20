package com.example.mula_starter

import android.app.Application
import androidx.room.Room
import com.example.mula_starter.data.database.AllocationDatabase

class MulacanoeApplication : Application() {
    companion object {
        lateinit var database: AllocationDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room
            .databaseBuilder(
                this,
                AllocationDatabase::class.java,
                "allocation_database"
            )
            .build()
    }
}