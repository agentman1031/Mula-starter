package com.example.mula_starter.activity.data.database.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "allocations")
data class InitalBalance(
    @PrimaryKey(autoGenerate = true) var id: Int,
    val initialBalance: Float?,
    @Embedded val expenses: Expenses?
)

data class Expenses(
    var expenseDescription: String?,
    var expenseAmount: Float?,
    var deductedBalance: Float? // TODO: Change to remainingBalance
)