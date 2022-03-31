package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class SignUpActivity : AppCompatActivity() {

    lateinit var backButtonSignUp: LinearLayout
    lateinit var btnGetStarted: Button
    lateinit var btnChooseHere: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        backButtonSignUp = findViewById(R.id.backButtonSignUp)
        btnGetStarted = findViewById(R.id.btnGetStarted)
        btnChooseHere = findViewById(R.id.btnChooseHere)

        backButtonSignUp.setOnClickListener {
            onBackPressed()
        }

        btnGetStarted.setOnClickListener {
            val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        btnChooseHere.setOnClickListener {

            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent, "Select a file"), 111)
        }

    }
}