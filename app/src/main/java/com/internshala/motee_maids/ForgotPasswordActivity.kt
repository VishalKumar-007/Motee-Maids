package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var backButtonForgot: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnSubmit = findViewById(R.id.btnSubmit)
        backButtonForgot = findViewById(R.id.backButtonForgot)

        btnSubmit.setOnClickListener {
            val intent = Intent(this@ForgotPasswordActivity, VerifyOtpActivity::class.java)
            startActivity(intent)
        }

        backButtonForgot.setOnClickListener {
            onBackPressed()
        }

    }
}