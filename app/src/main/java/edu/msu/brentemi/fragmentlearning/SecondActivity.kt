package edu.msu.brentemi.fragmentlearning

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by User on 4/9/2017.
 */

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity_layout)

        Log.d(TAG, "onCreate: started.")


    }

    companion object {
        private val TAG = "SecondActivity"
    }
}
