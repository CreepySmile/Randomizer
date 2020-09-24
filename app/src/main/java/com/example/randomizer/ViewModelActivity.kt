package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.randomizer.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

open class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        val countViewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        txtVMCount.text = countViewModel.getCount().toString()
        btnVMCount.setOnClickListener {
            val count = txtVMCount.text.toString().toInt()
            countViewModel.setCount(count)
            txtVMCount.text = countViewModel.getCount().toString()
        }
    }



}