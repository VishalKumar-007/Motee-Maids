package com.internshala.motee_maids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    lateinit var imgHamburger: ImageView
    lateinit var imgFilter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        imgHamburger = findViewById(R.id.imgHamburger)
        imgFilter = findViewById(R.id.imgFilter)

        imgHamburger.setOnClickListener {
            Toast.makeText(this, "Clicked on Hamburger Icon", Toast.LENGTH_SHORT).show()
        }

        imgFilter.setOnClickListener {
            Toast.makeText(this, "Clicked on Filter Icon", Toast.LENGTH_SHORT).show()
        }
    }
}