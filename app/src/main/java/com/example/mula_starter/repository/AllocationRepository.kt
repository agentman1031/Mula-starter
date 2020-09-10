package com.example.mula_starter.repository

import androidx.lifecycle.LiveData
import com.example.mula_starter.data.database.AllocationDao
import com.example.mula_starter.data.database.model.Expense
import com.example.mula_starter.data.database.model.InitialBalance

class AllocationRepository(private val allocationDao: AllocationDao) {

        val readAllData: LiveData<List<InitialBalance>> = allocationDao.readAllData()

        suspend fun submitInitialBalance(initialBalance: InitialBalance){
            allocationDao.submitInitialBalance(initialBalance)
        }

        suspend fun updateInitialBalance(initialBalance: InitialBalance){
            allocationDao.updateInitialBalance(initialBalance)
        }

        suspend fun addExpenseDescription(expense: Expense){
        allocationDao.addExpenseDescription(expense)
        }

        suspend fun updateExpenseDescription(expense: Expense){
            allocationDao.updateExpenseDescription(expense)
        }


        suspend fun deleteExpense(expense: Expense){
            allocationDao.deleteExpense(expense)
        }

        suspend fun deleteAllAllocations(){
            allocationDao.deleteAllAllocations()
        }


}
