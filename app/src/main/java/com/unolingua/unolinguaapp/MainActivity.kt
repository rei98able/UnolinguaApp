package com.unolingua.unolinguaapp

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.unolingua.unolinguaapp.ui.favourites.FavouritesFragment
import com.unolingua.unolinguaapp.ui.lessons.LessonsFragment
import com.unolingua.unolinguaapp.ui.profile.ProfileFragment
import com.unolingua.unolinguaapp.ui.rating.RatingFragment
import com.unolingua.unolinguaapp.ui.theory.TheoryFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setCustomView(R.layout.custom_action_bar_layout)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.white)))
        supportActionBar?.elevation = 0f
        navView.setupWithNavController(navController)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    @SuppressLint("RestrictedApi")
    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_lessons -> {
                    val lessonsFragment = LessonsFragment()
                    openFragment(lessonsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_theory -> {
                    val theoryFragment = TheoryFragment()
                    openFragment(theoryFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_profile -> {
                    val profileFragment = ProfileFragment()
                    openFragment(profileFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_rating -> {
                    val ratingFragment = RatingFragment()
                    openFragment(ratingFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_favourites -> {
                    val favouritesFragment = FavouritesFragment()
                    openFragment(favouritesFragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
