package com.shevy.kotlintelegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth
import com.shevy.kotlintelegram.activities.RegisterActivity
import com.shevy.kotlintelegram.databinding.ActivityMainBinding
import com.shevy.kotlintelegram.ui.fragments.ChatFragment
import com.shevy.kotlintelegram.ui.objects.AppDrawer
import com.shevy.kotlintelegram.utilits.AUTH
import com.shevy.kotlintelegram.utilits.initFirebase
import com.shevy.kotlintelegram.utilits.replaceActivity
import com.shevy.kotlintelegram.utilits.replaceFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if (AUTH.currentUser != null) {
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            replaceFragment(ChatFragment(), false)
        } else {
            replaceActivity(RegisterActivity())
        }
    }

    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
        initFirebase()
    }
}