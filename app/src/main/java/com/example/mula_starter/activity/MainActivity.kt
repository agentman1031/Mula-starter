package com.example.mula_starter.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import com.example.mula_starter.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Submit enterBalance via keyboard submit
        enterBalanceId.onSubmit { // Get text from EditText
            // com.example.mula.insert balance into database
            if (!TextUtils.isEmpty(enterBalanceId.text.toString())) {
                // com.example.mula.insert balance into database
                //TODO REMOVE FOR ROOM DATABASE -> dm?.insert(enterBalance.text.toString())

                startActivity(Intent(this, AllocationListActivity::class.java))

            } else {
                Toast.makeText(this, "Please enter starting balance", Toast.LENGTH_LONG).show()
            }
        }
        //Submit input via submit_button // todo: Decide which submit method to use
        submit_button.setOnClickListener() {

            if (!TextUtils.isEmpty(enterBalanceId.text.toString())) {
                /*
                progressDialog!!.setMessage("Saving...")

                //TODO REMOVE FOR ROOM DATABASE -> dm?.insert(enterBalance.text.toString())

                progressDialog!!.show()

                progressDialog!!.cancel()

                 */

                startActivity(Intent(this, AllocationListActivity::class.java))

            } else {
                Toast.makeText(this, "Please enter starting balance", Toast.LENGTH_LONG).show()
            }
        }
    }

    // Function for keyboard submit
    private fun EditText.onSubmit(func: () -> Unit) {
        setOnEditorActionListener { _, actionId, _ ->

            if (actionId == EditorInfo.IME_ACTION_DONE) {
                func()
            }
            true

        }
    }
}