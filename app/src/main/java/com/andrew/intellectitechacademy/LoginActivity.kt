package com.andrew.intellectitechacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //ASSIGNING TASK TO SIGN UP TEXT
        val toSigntxt = findViewById<TextView>(R.id.logSignUptxt)
        toSigntxt.setOnClickListener{
            val b = Intent(this, SignUpActivity::class.java)
            startActivity(b)
        }

        //ASSIGNING TASK TO LOG IN BUTTON
        val loginbtn = findViewById<Button>(R.id.logbtn)
        loginbtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}