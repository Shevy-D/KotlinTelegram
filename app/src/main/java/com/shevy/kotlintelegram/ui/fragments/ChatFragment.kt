package com.shevy.kotlintelegram.ui.fragments

import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.utilits.APP_ACTIVITY

class ChatFragment : Fragment(R.layout.fragment_chat) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Чаты"
    }

}