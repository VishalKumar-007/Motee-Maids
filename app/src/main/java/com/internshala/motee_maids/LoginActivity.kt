package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister: TextView
    lateinit var btnLogin: Button
    lateinit var etEnterPassword: EditText
    lateinit var etEnterPartnerID: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)
        btnLogin = findViewById(R.id.btnLogin)
        etEnterPassword = findViewById(R.id.etEnterPassword)
        etEnterPartnerID = findViewById(R.id.etEnterPartnerID)

        txtForgotPassword.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        txtRegister.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {

            val enteredPassword = etEnterPassword.text.toString()
            val enteredPartnerID = etEnterPartnerID.text.toString()

            if(enteredPartnerID.isEmpty()) {
                etEnterPartnerID.error = "This field cannot be empty"
            }
            else if (enteredPartnerID.length != 8) {
                etEnterPartnerID.setError("Please enter a valid partner ID")
            }
            if (enteredPassword.isEmpty()) {
                etEnterPassword.setError("This field cannot be empty")
            }
            else if (enteredPassword.length < 8) {
                etEnterPassword.setError("Please enter at least 8 characters")
            }
            else if (enteredPassword.length > 16) {
                etEnterPassword.setError("You can enter a maximum of 16 characters")
            }
            else {
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }

        }

    }
}