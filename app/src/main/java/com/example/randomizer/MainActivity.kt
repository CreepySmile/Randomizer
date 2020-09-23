package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToast.setOnClickListener {
            Toast.makeText(this,"This is a Toast",Toast.LENGTH_LONG).show()
        }
        btnCount.setOnClickListener {
            var count : Int = 0
            count += 1
            txtCount.text = count.toString()
        }
        btnRandom.setOnClickListener {
            var randomNumber : Int = (0..100).random()
            txtCount.text = randomNumber.toString()
        }
    }
}