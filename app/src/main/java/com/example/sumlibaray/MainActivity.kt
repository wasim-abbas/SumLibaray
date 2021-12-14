package com.example.sumlibaray

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var ed1: EditText
    lateinit var ed2: EditText
    lateinit var textview1: TextView
    val a:String= ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)


        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivision = findViewById(R.id.btnDivision)
        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)
        textview1 = findViewById(R.id.textview1)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)

    }
    override fun onClick(view: View) {
        val edt1 = ed1.text.toString()
        var edt2 = ed2.text.toString()

        if (edt1 == "" || edt2 == "") {
            ed1.error = "enter number"
            ed2.error = "enter number"
        } else {
            when (view.id) {   ///add sum are from my libaray
                R.id.btnAdd -> textview1.text = Add.sum(edt1.toInt(), edt2.toInt()).toString()
                R.id.btnSub -> textview1.text = Add.Sub(edt1.toInt(), edt2.toInt()).toString()
                R.id.btnMultiply -> textview1.text =
                    Add.multilpy(edt1.toInt(), edt2.toInt()).toString()
                R.id.btnDivision -> textview1.text =
                    Add.divide(edt1.toInt(), edt2.toInt()).toString()

            }
            ed1.text = Editable.Factory.getInstance().newEditable(a)
            ed2.text = Editable.Factory.getInstance().newEditable(a)
        }

    }
}
