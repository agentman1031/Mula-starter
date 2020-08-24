package com.example.mula_starter.data.database.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "allocations")
data class InitialBalance(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val initialBalance: Float?,
    @Embedded val expense: Expense?
)

data class Expense(

    var expenseDescription: String?,
    var expenseAmount: Float?,
    var deductedBalance: Float? // TODO: Change to remainingBalance
)

class Allocation {

}
