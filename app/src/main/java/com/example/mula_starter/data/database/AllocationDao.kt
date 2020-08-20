package com.example.mula_starter.data.database
import android.renderscript.Allocation
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AllocationDao {
/*
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(allocation: Allocation)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(expenses: Expenses)

 */

    //Try This First
    @Query("SELECT * FROM allocations")
    fun getAll(): List<Allocation>

    @Insert
    fun insertAll(vararg allocation: Allocation)

}