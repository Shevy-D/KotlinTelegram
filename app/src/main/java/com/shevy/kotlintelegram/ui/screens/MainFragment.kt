package com.shevy.kotlintelegram.ui.screens

import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.utilits.APP_ACTIVITY
import com.shevy.kotlintelegram.utilits.hideKeyBoard

class MainFragment : Fragment(R.layout.fragment_chat) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Telegram"
        APP_ACTIVITY.mAppDrawer.enableDrawer()
        hideKeyBoard()
    }
}