package com.example.mula_starter.data.database.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Expense(
    var expenseDescription: String?,
    var expenseAmount: Float?,
    var deductedBalance: Float? // TODO: Change to remainingBalance
)

@Entity(tableName = "allocations")
data class InitialBalance(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val balanceInput: Float?,
    @Embedded val expense: Expense?
)



class Allocation {

}
