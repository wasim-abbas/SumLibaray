package com.example.sumlibaray

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
}