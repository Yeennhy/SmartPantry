package com.studyfinder.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.studyfinder.app.databinding.ActivityMainBinding

/**
 * The single Activity for the whole app (§2 of the dev plan).
 *
 * Every screen is a Fragment destination inside [nav_graph]; this class only
 * hosts the NavHostFragment and, later, decides the start destination at
 * runtime based on auth + community state (see §7.0 of the dev plan).
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}
