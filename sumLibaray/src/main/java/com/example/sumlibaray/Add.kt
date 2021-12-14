package com.example.sumlibaray

import android.content.Context
import android.view.View

object Add:MyMath {

    override fun sum(a:Int, b:Int):Int
    { return  a+b
    }

    override fun Sub(a: Int, b: Int): Int {
        return a-b
    }

    override fun multilpy(a: Int, b: Int): Int {

        val mult= a*b
        return  mult
    }

    override fun divide(a: Int, b: Int): Int {

        val div = a/b
        return div
    }

    fun activirt(contxt:Context):View
    {
        val a = View.inflate(contxt,R.layout.activity_sum,null)

        return a
    }
}