package edu.msu.brentemi.fragmentlearning

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


/**
 * Created by User on 4/9/2017.
 */

class Frag1 : Fragment() {

    lateinit var btnNavFrag1: Button
    lateinit var btnNavFrag2: Button
    lateinit var btnNavSecondActivity: Button

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment1_layout, container, false)
        btnNavFrag1 = view.findViewById(R.id.btnNavFrag1) as Button
        btnNavFrag2 = view.findViewById(R.id.btnNavFrag2) as Button
        btnNavSecondActivity = view.findViewById(R.id.btnNavSecondActivity) as Button
        Log.d(TAG, "onCreateView: started.")

        btnNavFrag1.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 1", Toast.LENGTH_SHORT).show()

            (activity as MainActivity).setViewPager(0)
        }

        btnNavFrag2.setOnClickListener {
            Toast.makeText(activity, "Going to Fragment 2", Toast.LENGTH_SHORT).show()
            (activity as MainActivity).setViewPager(1)
        }


        btnNavSecondActivity.setOnClickListener {
            Toast.makeText(activity, "Going to Second Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity, SecondActivity::class.java)
            startActivity(intent)
        }


        return view
    }

    companion object {
        private val TAG = "Fragment1"
    }
}
