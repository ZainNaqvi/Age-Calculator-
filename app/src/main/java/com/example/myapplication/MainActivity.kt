package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val value = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
           if(value.text.toString().toInt()<100){
               val currentValue = value.text.toString().toInt()
               val newValue = currentValue + 1
               value.text = newValue.toString()
           }
        }

        button2.setOnClickListener {
         if(value.text.toString().toInt()>0){
             val currentValue = value.text.toString().toInt()
             val newValue = currentValue - 1
             value.text = newValue.toString()
         }
        }

    }


}