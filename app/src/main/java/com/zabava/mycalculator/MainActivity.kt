package com.zabava.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
        val btnZero: Button = findViewById(R.id.btnZero)
        val btnOne: Button = findViewById(R.id.btnOne)
        val btnTwo: Button = findViewById(R.id.btnTwo)
        val btnThree: Button = findViewById(R.id.btnThree)
        val btnFour: Button = findViewById(R.id.btnFour)
        val btnFive: Button = findViewById(R.id.btnFive)
        val btnSix: Button = findViewById(R.id.btnSix)
        val btnSeven: Button = findViewById(R.id.btnSeven)
        val btnEight: Button = findViewById(R.id.btnEight)
        val btnNine: Button = findViewById(R.id.btnNine)
        val btnDivide: Button = findViewById(R.id.btnDivide)
        val btnMultiply: Button = findViewById(R.id.btnMultiply)
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val btnSubtract: Button = findViewById(R.id.btnSubtract)
        val btnEqual: Button = findViewById(R.id.btnEqual)
        val btnClear: Button = findViewById(R.id.btnCLEAR)

        val numbers = listOf(btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine)
        for (i in numbers){
            i.setOnClickListener { onDigit(i) }
        }

        btnClear.setOnClickListener { onClear(btnClear) }

    }

    private fun onDigit(view: View) {
        tvInput?.append((view as Button).text)
    }

    fun onClear(view: View) {
        tvInput?.text = ""
    }

}