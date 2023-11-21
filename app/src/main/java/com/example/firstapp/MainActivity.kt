package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a1: Animal = Dog("Jack", 5)
        val a2: Animal = Bird("Jack", 5)

    }

}