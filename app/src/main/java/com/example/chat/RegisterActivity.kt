package com.example.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    private val tag = "RegisterActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)
        val button : Button = findViewById(R.id.button_reg_enter)
        Log.i(tag, "onCreate")

        button.setOnClickListener{
            val email = findViewById<TextInputLayout>(R.id.emailField).editText?.text.toString()
            val password = findViewById<TextInputLayout>(R.id.passwordField).editText?.text.toString()
            val passwordComf = findViewById<TextInputLayout>(R.id.ConfirmPassword).editText?.text.toString()

            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

                if (password == passwordComf){
                    val intent = Intent(this, LoginActivity::class.java)

                    intent.putExtra("email", email)
                    intent.putExtra("password", password)


                    startActivity(intent)
                }

                else if (password == null){
                    Toast.makeText(applicationContext, "Введите пароль", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(applicationContext, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext, "Введите существующий email", Toast.LENGTH_SHORT).show()
            }
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