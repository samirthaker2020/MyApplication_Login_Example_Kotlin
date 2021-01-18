package com.example.myapplication_login_example_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // fetch conteol ids
        val btnlogin=findViewById<Button>(R.id.btn_login);
        val email= findViewById<EditText>(R.id.editText_emailid);
        val password=findViewById<EditText>(R.id.editText_password);
        

    }
}