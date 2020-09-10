package com.example.mula_starter.data.database.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Expense(
    val expenseDescription: String?,
    val expenseAmount: Float?,
    val deductedBalance: Float? // TODO: Change to remainingBalance
)

@Entity(tableName = "allocations")
data class InitialBalance(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val balanceInput: Float?,
    @Embedded val expense: Expense?
)


