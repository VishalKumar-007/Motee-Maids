package com.internshala.motee_maids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class SignUpActivity : AppCompatActivity() {

    lateinit var backButtonSignUp: LinearLayout
    lateinit var btnGetStarted: Button
    lateinit var btnChooseHere: Button
    lateinit var etEnterName: EditText
    lateinit var etEnterEmail: EditText
    lateinit var etEnterPanCard: EditText
    lateinit var etEnterZipCode: EditText
    lateinit var etEnterMobileNumber: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        backButtonSignUp = findViewById(R.id.backButtonSignUp)
        btnGetStarted = findViewById(R.id.btnGetStarted)
        btnChooseHere = findViewById(R.id.btnChooseHere)
        etEnterName = findViewById(R.id.etEnterName)
        etEnterEmail = findViewById(R.id.etEnterEmail)
        etEnterPanCard = findViewById(R.id.etEnterPanCard)
        etEnterZipCode = findViewById(R.id.etEnterZipCode)
        etEnterMobileNumber = findViewById(R.id.etEnterMobileNumber)

        backButtonSignUp.setOnClickListener {
            onBackPressed()
        }

        btnGetStarted.setOnClickListener {

            val enteredName = etEnterName.text.toString()
            val enteredEmail = etEnterEmail.text.toString()
            val enteredPanNumber = etEnterPanCard.text.toString()
            val enteredZipCode = etEnterZipCode.text.toString()
            val enteredMobileNumber = etEnterMobileNumber.text.toString()

            if(enteredName.isEmpty()) {
                etEnterName.error = "This field cannot be empty"
            }
            else if (enteredName.length < 2) {
                etEnterName.setError("Should contain at least 2 characters")
            }
            else if (enteredEmail.isEmpty()) {
                etEnterEmail.setError("This field cannot be empty")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(enteredEmail).matches()){
                etEnterEmail.setError("Please enter a valid email address")
            }
            else if (enteredPanNumber.isEmpty()) {
                etEnterPanCard.setError("This field cannot be empty")
            }
            else if (enteredPanNumber.length < 10) {
                etEnterPanCard.setError("This field should contain 10 digits")
            }
            else if (enteredZipCode.isEmpty()) {
                etEnterZipCode.setError("This field cannot be empty")
            }
            else if (enteredZipCode.length < 5) {
                etEnterZipCode.setError("This field should contain at least 5 digits")
            }
            else if (enteredMobileNumber.isEmpty()) {
                etEnterMobileNumber.setError("This field cannot be empty")
            }
            else if (enteredMobileNumber.length < 10) {
                etEnterMobileNumber.setError("This field should contain 10 digits")
            }
            else {
                val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
                startActivity(intent)
            }

        }

        btnChooseHere.setOnClickListener {

            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent, "Select a file"), 111)
        }

    }
}