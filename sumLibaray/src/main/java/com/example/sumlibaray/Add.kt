package com.example.sumlibaray

import android.content.Context
import android.view.View

object Add : MyMath {

    override fun sum(a: Int, b: Int) = a + b
    override fun Sub(a: Int, b: Int) = a - b
    override fun multilpy(a: Int, b: Int) = a * b
    override fun divide(a: Int, b: Int) = a / b
    fun activity(contxt: Context) = View.inflate(contxt, R.layout.activity_sum, null)
}