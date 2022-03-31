package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {

    lateinit var backButtonSignUp: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        backButtonSignUp = findViewById(R.id.backButtonSignUp)

        backButtonSignUp.setOnClickListener {
            onBackPressed()
        }
    }
}