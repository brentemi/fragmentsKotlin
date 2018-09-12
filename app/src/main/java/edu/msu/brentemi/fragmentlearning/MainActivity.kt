package edu.msu.brentemi.fragmentlearning


import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var mSectionsStatePagerAdapter: SectionsStatePagerAdapter? = null
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Started.")

        mSectionsStatePagerAdapter = SectionsStatePagerAdapter(supportFragmentManager)

        mViewPager = findViewById(R.id.container)
        //setup the pager
        setupViewPager(mViewPager!!)

    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = SectionsStatePagerAdapter(supportFragmentManager)
        adapter.addFragment(Frag1(), "Fragment1")
        adapter.addFragment(Frag2(), "Fragment2")
        viewPager.adapter = adapter
    }

    fun setViewPager(fragmentNumber: Int) {
        mViewPager!!.currentItem = fragmentNumber
    }

    companion object {

        private val TAG = "MainActivity"
    }
}
