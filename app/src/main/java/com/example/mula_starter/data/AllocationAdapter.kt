package com.example.mula_starter.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mula_starter.R
import com.example.mula_starter.activity.AllocationListActivity
import com.example.mula_starter.data.database.model.Allocation

data class AllocationAdapter(
    private val allocationRecyclerView: AllocationListActivity,
    private val allocationList: ArrayList<Allocation>
)
    : RecyclerView.Adapter<AllocationAdapter.ListItemHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ListItemHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_row_content, parent, false)

        return ListItemHolder(itemView)
    }

    override fun getItemCount(): Int {
        return allocationList.size

    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

        val allocation = allocationList[position]
        //holder.description.text = allocation.expenseDescription

        // Show the first 15 characters of the actual note
        //holder.amount.text =
          //  allocation.expenseAmount.toString() // REMOVED DUE TO LESS THAN 15 CHAR CRASH -> .substring(0, 15)


    }

    inner class ListItemHolder(view: View) :
        RecyclerView.ViewHolder(view),
        View.OnClickListener {

        internal var description =
            view.findViewById<View>(
                R.id.txtDescription) as TextView

        internal var amount =
            view.findViewById<View>(
                R.id.txtAmount) as TextView

        internal var deductedBalance =
            view.findViewById<View>(
                R.id.txtdeductedBalance) as TextView

        init {

            view.isClickable = true
            view.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            //allocationRecyclerView.showAllocation(adapterPosition)
        }

    }


}