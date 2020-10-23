package com.example.pythontutorials

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var frameLayout: FrameLayout
    lateinit var toolBar: androidx.appcompat.widget.Toolbar
    lateinit var navigationView: NavigationView
    lateinit var sharedPreferences: SharedPreferences

    var previousMenuItem : MenuItem?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val username=sharedPreferences.getString("Name","")
        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        frameLayout = findViewById(R.id.frameLayout)
        toolBar = findViewById(R.id.toolbar)
        navigationView = findViewById(R.id.navigationView)
        print("homeactivity"+username)

        setUpToolBar()
        openFragment(HomeFragment())
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@HomeActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.closed_drawer
        )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()




        navigationView.setNavigationItemSelectedListener {
            //given 7 lines are used to highlight the selected menu in toolbar
            if (previousMenuItem==null)
            {
                previousMenuItem?.isChecked=false
            }
            it.isCheckable=true
            it.isChecked=true
            previousMenuItem=it



            when (it.itemId) {
                R.id.home -> {
                    var bundle=Bundle()
                    bundle.putString("Name",username)
                    var frags: HomeFragment = HomeFragment()
                    frags.arguments=bundle
                    openFragment(frags)
                    drawerLayout.closeDrawers()


                }

                R.id.aboutus ->{
                    var frags: AboutUsFragment = AboutUsFragment()
                    openFragment(frags)
                    drawerLayout.closeDrawers()


                }

            }

            return@setNavigationItemSelectedListener true
        }
    }

    private fun setUpToolBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Python"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }

    fun openFragment(fragment: Fragment) {
        val tansaction = supportFragmentManager.beginTransaction()
        tansaction.replace(R.id.frameLayout, fragment).commit()
        supportActionBar?.title = "Python Course"
    }

    override fun onBackPressed() {
    finishAffinity()
    }



}

