package com.example.gb04_android_on_kotlin_start

import android.util.Log

object DataBase {

    val TAG = "AnimalsDB"
    val DATA_BASE_NAME = "Animals"

    fun open() {
        Log.d(TAG, "Database open")
    }

    fun close() {
        Log.d(TAG, "Database close")
    }

}