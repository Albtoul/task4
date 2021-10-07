package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tx:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tx=findViewById(R.id.textView)

        val i = intent
        val name =i.getStringExtra("tag")
        val location = i.getStringExtra("tag1")
        tx.text="Name: $name  Location $location"

    }
}