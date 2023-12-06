package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val fig_1 = Geometry.Square()
    val fig_2 = Geometry.Rectangle()
    val fig_3 = Geometry.Quadrangle()
    val fig_4 = Geometry.Circumference()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCClick(view: View){
        var per1 = findViewById<TextView>(R.id.Plosh)
        var per2 = findViewById<EditText>(R.id.figure)
        if(per2.hint == "Circle"){
            per1.text = fig_1.toSquare1()
        }
       if(per2.hint == "Rectangle") {
            per1.text = fig_2.toSquare2()
        }
      if(per2.hint == "Quadrilateral") {
            per1.text = fig_3.toSquare3()
        }
     if(per2.hint == "Circle") {
            per1.text = fig_4.toSquare4()
        }
    }
}