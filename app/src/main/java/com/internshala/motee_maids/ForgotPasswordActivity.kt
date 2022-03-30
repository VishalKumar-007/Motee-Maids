package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val intent = Intent(this@ForgotPasswordActivity, VerifyOtpActivity::class.java)
            startActivity(intent)
        }

    }
}