package io.dayatz.rimayahcalc

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import io.dayatz.rimayahcalc.fragments.Foc
import io.dayatz.rimayahcalc.fragments.Nabl
import io.dayatz.rimayahcalc.fragments.Shaft
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_shaft -> {
                loadFragment(Shaft())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_nabl -> {
                loadFragment(Nabl())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_foc -> {
                loadFragment(Foc())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        // default fragment on activity
        loadFragment(Shaft())
    }

    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
