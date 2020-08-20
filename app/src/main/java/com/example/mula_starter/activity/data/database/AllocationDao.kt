package com.example.mula_starter.activity.data.database
import android.renderscript.Allocation
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mula_starter.activity.data.database.model.Expenses

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