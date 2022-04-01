package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var backButtonForgot: LinearLayout
    lateinit var etEnterEmail2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnSubmit = findViewById(R.id.btnSubmit)
        backButtonForgot = findViewById(R.id.backButtonForgot)
        etEnterEmail2 = findViewById(R.id.etEnterEmail2)

        btnSubmit.setOnClickListener {

            val email2 = etEnterEmail2.text.toString()

            if (email2.isEmpty()) {
                etEnterEmail2.setError("This field cannot be empty")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email2).matches()){
                etEnterEmail2.setError("Please enter a valid email address")
            }
            else {
                val intent = Intent(this@ForgotPasswordActivity, VerifyOtpActivity::class.java)
                startActivity(intent)
            }
        }

        backButtonForgot.setOnClickListener {
            onBackPressed()
        }
    }
}