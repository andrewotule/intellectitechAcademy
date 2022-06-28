package com.andrew.intellectitechacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //ASSIGNING TASK TO SIGN up TEXT
        val toLogtxt = findViewById<TextView>(R.id.signLogIntxt)
        toLogtxt.setOnClickListener{
            val b = Intent(this, LoginActivity::class.java)
            startActivity(b)
        }

        //ASSIGNING TASK TO SIGN up BUTTON
        val signupbtn = findViewById<Button>(R.id.signbtn)
        signupbtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}