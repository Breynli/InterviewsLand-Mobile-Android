package com.example.interviewsland_mobile_android.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.interviewsland_mobile_android.R
import com.example.interviewsland_mobile_android.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_tablayout.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navView, navHostFragment.navController)

        val toogle = ActionBarDrawerToggle(this, binding.drawerLayout, toolbar, 0, 0)
        toogle.drawerArrowDrawable.color = this.getColor(R.color.black)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.isDrawerIndicatorEnabled = true
        toogle.syncState()

        navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.savedQuestionsFragment -> navigationFragments(R.id.savedQuestionsFragment)
//            R.id.logOut -> showAlertDialog()
            else -> false
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun navigationFragments(id: Int){
        binding.navHostFragmentView.findNavController().navigate(id)
    }

}