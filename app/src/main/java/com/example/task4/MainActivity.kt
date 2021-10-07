package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edtxname:EditText
    lateinit var edtxlocation:EditText
    lateinit var go:Button
    lateinit var a:String
    lateinit var x:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtxname=findViewById(R.id.editTextTextPersonName)
        edtxlocation=findViewById(R.id.editTextTextPersonName2)
        go=findViewById(R.id.button)
    }

    fun GO(view: android.view.View) {

        var namws = edtxname.text.toString()
        var loc = edtxlocation.text.toString()
        var i = Intent(this, MainActivity2::class.java)
        i.putExtra("tag",edtxname.text.toString())
        i.putExtra("tag1",edtxlocation.text.toString())
        startActivity(i)


    }
}