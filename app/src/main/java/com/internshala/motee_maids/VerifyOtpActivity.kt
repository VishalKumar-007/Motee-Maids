package com.internshala.motee_maids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.chaos.view.PinView

class VerifyOtpActivity : AppCompatActivity() {

    lateinit var pinView: PinView
    lateinit var backButtonOtp: LinearLayout
    lateinit var btnConfirmOtp: Button
    lateinit var txtResendOtp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        pinView = findViewById(R.id.pinView)
        backButtonOtp = findViewById(R.id.backButtonOtp)
        btnConfirmOtp = findViewById(R.id.btnConfirmOtp)
        txtResendOtp = findViewById(R.id.txtResendOtp)

        pinView.requestFocus()

        backButtonOtp.setOnClickListener {
            onBackPressed()
        }

        btnConfirmOtp.setOnClickListener {
            Toast.makeText(this, "Clicked on Confirm OTP", Toast.LENGTH_SHORT).show()
        }

        txtResendOtp.setOnClickListener {
            Toast.makeText(this, "Clicked on Resend OTP", Toast.LENGTH_SHORT).show()
        }

    }
}