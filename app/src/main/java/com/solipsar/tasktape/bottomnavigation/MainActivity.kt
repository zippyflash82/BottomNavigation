package com.solipsar.tasktape.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.nav_view)
        val home = Home.newInstance()
        val dashboard = Dashboard.newInstance()
        bottomNavigation.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.navigation_dashboard -> {
                    toolbar.title = "Dashboard"
                    openFragment(dashboard)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.navigation_home -> {
                    toolbar.title = "Home"
                    openFragment(home)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.navigation_notifications -> {
                    return@setOnNavigationItemReselectedListener

                }
                R.id.navigation_notifications2 -> {
                    return@setOnNavigationItemReselectedListener

                }
                else -> return@setOnNavigationItemReselectedListener
            }
        }
    }

    // function for replacing fragment
    fun openFragment(fragment: Fragment) {
       supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
    }
}