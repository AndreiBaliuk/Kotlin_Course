package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1 : Byte = Byte.MIN_VALUE
    var num1_2 : Byte = Byte.MAX_VALUE

    val num2: Short = Short.MIN_VALUE
    val num2_2: Short = Short.MAX_VALUE

    val num3: Int = Int.MIN_VALUE
    val num3_2: Int = Int.MAX_VALUE

    val num4: Long = Long.MIN_VALUE
    val num4_2: Long = Long.MAX_VALUE

    val num5: Float = Float.MIN_VALUE
    val num5_2: Float = Float.MAX_VALUE

    val num6: Double = Double.MIN_VALUE
    val num6_2: Double = Double.MAX_VALUE

    val num7: Char = Char.MIN_VALUE
    val num7_2: Char = Char.MAX_VALUE

    lateinit var num8: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View){
        val per1 = findViewById<TextView>(R.id.textView14)
        val per2 = findViewById<TextView>(R.id.textView15)
        val per3 = findViewById<TextView>(R.id.textView16)
        val per4 = findViewById<TextView>(R.id.textView17)
        val per5 = findViewById<TextView>(R.id.textView18)
        val per6 = findViewById<TextView>(R.id.textView19)
        val per7 = findViewById<TextView>(R.id.textView20)
        val per8 = findViewById<TextView>(R.id.textView21)

        per1.text = "1. Byte: - Целочисленная переменная диапазон значений от $num1 до $num1_2"

        per2.text = "1. Short: - Целочисленная переменная диапазон значений от $num2 до $num2_2"

        per3.text = "1. Int: - Целочисленная переменная диапазон значений от $num3 до $num3_2"

        per4.text = "1. Long: - Целочисленная переменная диапазон значений от $num4 до $num4_2"

        per5.text = "1. Float: - Переменная с плавающей точкой диапазон значений от $num5 до $num5_2"

        per6.text = "1. Double: - Переменная с плавающей точкой диапазон значений от $num6 до $num6_2"

        per8.text = "1. Char: - Переменная символьного типа диапазон значений от $num7 до $num7_2"

        per7.text = "1. String: - Переменная хранит текстовое значение"

    }



}