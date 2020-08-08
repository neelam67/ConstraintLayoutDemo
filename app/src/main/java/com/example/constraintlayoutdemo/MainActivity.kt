package com.example.constraintlayoutdemo

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val roundedLogo = RoundedBitmapDrawableFactory.create(resources, bitmap)
        roundedLogo.cornerRadius = 15f

        logo.setImageDrawable(roundedLogo)
    }
}