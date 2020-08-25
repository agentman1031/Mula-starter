package com.example.mula_starter.activity;

import android.os.Bundle
import android.renderscript.Allocation
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.mula_starter.R
import com.example.mula_starter.data.AllocationAdapter
import com.example.mula_starter.data.database.AllocationDatabase
import com.example.mula_starter.data.database.model.InitialBalance

class AllocationListActivity: AppCompatActivity() {

    private var allocationList = ArrayList<Allocation>()
    private var recyclerView: RecyclerView? = null
    private var adapter: AllocationAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allocation_list)

        //Testing Room Database
        val database = Room.databaseBuilder(
            this, AllocationDatabase::class.java, "allocations"
        )
            .allowMainThreadQueries()
            .build()
        database.allocationDao().insertInitialBalance(
            InitialBalance(
                id = 0,
                balanceInput = 911.01f,
                expense = null

            )
        )

        val allAllocations = database.allocationDao().getAll()

        Log.d("scott", "allAllocation size? ${allAllocations}")
    }
}

/*
        //Display the string in the TextView
        //remainingBalance.text = "$" + list //<- FIX WARNING

        // Add button function
        fab.setOnClickListener { view ->
            val dialog = NewAllocationDialog()
            dialog.show(supportFragmentManager, "")

        }


        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView

        adapter = AllocationAdapter(this, allocationList)
        val layoutManager = LinearLayoutManager(applicationContext)

        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()

        // Add a neat dividing line between items in the list
        recyclerView!!.addItemDecoration(
            DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        )

        // set the adapter
        recyclerView!!.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_list_display, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }



    fun createNewAllocation(n: Allocation) {
        // Temporary code
        //tempNote = n
        allocationList.add(n)
        adapter!!.notifyDataSetChanged()
    }
/*
    fun showAllocation(allocationToShow: Int) {
        val dialog = ShowAllocationDialog()
        dialog.sendAllocationSelected(allocationList[allocationToShow])
        dialog.show(supportFragmentManager, "")
    }

 */

}

 */
