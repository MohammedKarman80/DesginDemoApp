package com.example.desgindemoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(SkillsFragment())
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_skills -> {
                replaceFragment(SkillsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_harbor -> {
                replaceFragment(SkillsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_balance -> {
                replaceFragment(SkillsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_calender -> {
                replaceFragment(SkillsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add -> {
                replaceFragment(SkillsFragment())
                return@OnNavigationItemSelectedListener true
            }
        }

        false

    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frame_content, fragment)
        fragmentTransaction.addToBackStack("null")
        fragmentTransaction.commit()

    }
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1)
            supportFragmentManager.popBackStack()
        else
            finish()
    }
}
