package com.cproject.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membawa "username" login ke main activity
        val a = intent.getStringExtra("username")


        // membawa "username" ke fragment home
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmenHome.newInstance("$a")).commit()


        bottnav.setOnItemSelectedListener {

            when(it.itemId){
                R.id.menuhome -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmenHome.newInstance("$a")).commit()
                    return@setOnItemSelectedListener false
                }
                R.id.web -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentWeb()).commit()
                    return@setOnItemSelectedListener false
                }
                R.id.menuprofil -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentProfile()).commit()
                    return@setOnItemSelectedListener false

                }
            }

            return@setOnItemSelectedListener false
        }

    }
}