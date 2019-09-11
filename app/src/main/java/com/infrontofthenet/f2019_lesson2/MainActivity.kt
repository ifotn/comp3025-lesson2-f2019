package com.infrontofthenet.f2019_lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// add synthetic extension to automatically bind all views
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // no longer required with synthetic extension
//    private lateinit var editTextUsername : EditText
//    private lateinit var editTextPassword: EditText
//    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // no longer required with synthetic extension
//        // instantiate 3 views
//        editTextUsername = findViewById(R.id.editTextUsername)
//        editTextPassword = findViewById(R.id.editTextPassword)
//        buttonLogin = findViewById(R.id.buttonLogin)

        // check user input
        buttonLogin.setOnClickListener {
            var username = editTextUsername.text.toString()
            var password = editTextPassword.text.toString()
            var message = "Try again"

            if (username == "student@gc.ca" && password == "Password") {
                message = "Welcome"
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
