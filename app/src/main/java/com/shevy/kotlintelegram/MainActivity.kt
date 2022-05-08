package com.shevy.kotlintelegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shevy.kotlintelegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}