package com.example.mula_starter.data.database
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mula_starter.data.database.model.Expense
import com.example.mula_starter.data.database.model.InitialBalance

@Dao
interface AllocationDao {

    //INSERT initial starting balance into database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun submitInitialBalance(initialBalance: InitialBalance)

    //UPDATE(edit) initial balance in database.
    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateInitialBalance(initialBalance: InitialBalance)//TODO:Rename initialBalance in @Entity

    //INSERT expense description to database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addExpenseDescription(expense: Expense) //Might can change to initialBalance (ENTITY)

    //UPDATE(edit) expense description.
    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateExpenseDescription(expense: Expense)

    //DELETE expense and description
    @Delete
    suspend fun deleteExpense(expense: Expense)

    //DELETE entire database table
    @Query("DELETE FROM allocations")
    suspend fun deleteAllAllocations()

    //SELECT all allocation and list them by ID. Hopefully the @Embedded data class also.
    @Query("SELECT * FROM allocations ORDER BY id ASC")
    fun readAllData(): LiveData<List<InitialBalance>>

}