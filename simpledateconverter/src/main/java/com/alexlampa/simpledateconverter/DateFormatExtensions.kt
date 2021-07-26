package com.alexlampa.simpledateconverter

import android.annotation.SuppressLint
import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
fun Long.convertToReadableDate(expectedFormat: String): String {
    return try {
        SimpleDateFormat(expectedFormat).format(Date(this))
    } catch (e: Exception) {
        ""
    }
}

@SuppressLint("SimpleDateFormat")
fun Long.convertToReadableDateWithRelativeTime(expectedFormat: String): String {
    return try {
        val timeInMs = this
        if (DateUtils.isToday(timeInMs) || DateUtils.isToday(timeInMs + DateUtils.DAY_IN_MILLIS)) { // today or yesterday
            DateUtils.getRelativeTimeSpanString(timeInMs, System.currentTimeMillis(), DateUtils.DAY_IN_MILLIS).toString()
        } else {
            SimpleDateFormat(expectedFormat).format(Date(this))
        }
    } catch (e: Exception) {
        ""
    }
}

@SuppressLint("SimpleDateFormat")
fun String.convertToMillis(inputFormat: String): Long {
    return try {
        SimpleDateFormat(inputFormat).parse(this)?.time ?: 0L
    } catch (e: Exception) {
        0L
    }
}