package com.knackpark.bottonavigationviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.knackpark.bottonavigationviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val nav = binding.bottomNav
        val navController = findNavController(R.id.container)

        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.home ,R.id.accessibility , R.id.add ,R.id.dark , R.id.profile
        ))
        setupActionBarWithNavController(navController ,appBarConfiguration)
        nav.setupWithNavController(navController)

    }
}