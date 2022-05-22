package com.shevy.kotlintelegram.ui.fragments

import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.MainActivity
import com.shevy.kotlintelegram.utilits.APP_ACTIVITY


open class BaseFragment (layout: Int) : Fragment(layout) {

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}