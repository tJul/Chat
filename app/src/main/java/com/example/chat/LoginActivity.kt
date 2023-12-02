package com.example.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private fun enter(email:String, password:String) : Boolean{
        if((email == "example@mail.ru") && (password =="1111")) {
            return true
        }
        return false
    }
    private val tag = "LoginActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(tag, "onCreate")
        setContentView(R.layout.activity_login)

        findViewById<EditText>(R.id.emailField).setText(intent.getStringExtra("email"),TextView.BufferType.EDITABLE)
        findViewById<EditText>(R.id.passwordField).setText(intent.getStringExtra("password"),TextView.BufferType.EDITABLE)

        val button= findViewById(R.id.button_enter)  as Button
        button.setOnClickListener{

            val email = findViewById<EditText>(R.id.emailField).text.toString()
            val password = findViewById<EditText>(R.id.passwordField).text.toString()

            if (enter(email, password)) {
                val intent = Intent(this, OnboardActivity::class.java)
                startActivity(intent)
            } else
                makeText(applicationContext, "Неверный логин или пароль", LENGTH_SHORT).show()
        }

    }
    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag,"onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag,"onRestart")
    }

}