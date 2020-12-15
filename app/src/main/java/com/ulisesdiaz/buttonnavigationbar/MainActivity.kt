package com.ulisesdiaz.buttonnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ulisesdiaz.buttonnavigationbar.Fragments.FirstFragment
import com.ulisesdiaz.buttonnavigationbar.Fragments.FourthFragment
import com.ulisesdiaz.buttonnavigationbar.Fragments.SecondFragment
import com.ulisesdiaz.buttonnavigationbar.Fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()
    private val fourthFragment = FourthFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottonNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        replaceFragment(firstFragment)

        bottonNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_gasolinerias ->{
                    replaceFragment(firstFragment)
                }
                R.id.menu_favoritos ->{
                    replaceFragment(secondFragment)
                }
                R.id.menu_recargas ->{
                    replaceFragment(thirdFragment)
                }
                R.id.menu_resenia ->{
                    replaceFragment(fourthFragment)
                }

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}