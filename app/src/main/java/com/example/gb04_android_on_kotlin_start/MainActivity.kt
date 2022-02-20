package com.example.gb04_android_on_kotlin_start

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var showToastButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        findViewById<Button>(R.id.show_toast_button).setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.test_data_class_button).setOnClickListener {
            val murzik = Cat("Мурзик", 4)
            Toast.makeText(this, murzik.toString(), Toast.LENGTH_SHORT).show()

            val barsik = murzik.copy(name = "Барсик")
            println(barsik)
        }

        findViewById<Button>(R.id.test_while_button).setOnClickListener {
            var i = 1
            while (i < 5) {
                println("While ${i++}")
            }
        }

        findViewById<Button>(R.id.test_for_button).setOnClickListener {
            for (i in 5 downTo 1) {
                println("for $i")
            }
        }
    }
}