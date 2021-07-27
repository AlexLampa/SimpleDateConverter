package com.alexlampa.simpledateconverter

import android.annotation.SuppressLint
import android.content.Context
import android.text.format.DateUtils
import android.util.Log
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

fun showLog(text: String) {
    Log.d("simpledateconverter", text)
}

fun Context.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}
