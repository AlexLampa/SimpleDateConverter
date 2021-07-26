package com.example.simpledateconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alexlampa.simpledateconverter.convertToReadableDate
import com.alexlampa.simpledateconverter.convertToReadableDateWithRelativeTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("ExampleConverter", 1627219698000.convertToReadableDate("dd/MM/yyyy"))
        Log.d("ExampleConverter", 1627219698000.convertToReadableDateWithRelativeTime("dd/MM/yyyy"))

    }
}