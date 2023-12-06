package com.example.picture2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photo: ImageView = findViewById(R.id.imageView3)
        photo.setImageResource(R.drawable.free_png_ru_657)
    }
}