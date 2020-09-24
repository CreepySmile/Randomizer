package com.example.randomizer.viewmodel

import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private var count : Int = 0
    fun getCount(): Int = count
    fun setCount(num:Int):Int{
        count = num
        count += 1
        return count
    }
}