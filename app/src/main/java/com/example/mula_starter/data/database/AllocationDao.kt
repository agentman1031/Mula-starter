package com.example.mula_starter.data.database
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mula_starter.data.database.model.InitialBalance

@Dao
interface AllocationDao {
/*
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertInitialBalance(initialBalance: InitialBalance)
   // @Insert(onConflict = OnConflictStrategy.REPLACE)
    //fun insert(allocation: Allocation)
    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    //fun insertExpense(expense: Expense)

 */



    //Try This First

    @Query("SELECT * FROM allocations")
    fun getAll(): List<InitialBalance>
    @Insert
    fun insertInitialBalance(initialInitialBalance: InitialBalance)


}