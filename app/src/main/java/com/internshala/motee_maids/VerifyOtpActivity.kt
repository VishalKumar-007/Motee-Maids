package com.internshala.motee_maids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import com.chaos.view.PinView

class VerifyOtpActivity : AppCompatActivity() {

    lateinit var pinView: PinView
    lateinit var backButtonOtp: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        pinView = findViewById(R.id.pinView)
        backButtonOtp = findViewById(R.id.backButtonOtp)

        pinView.requestFocus()

        backButtonOtp.setOnClickListener {
            onBackPressed()
        }

    }
}