package com.shevy.kotlintelegram.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    private lateinit var mBinding: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentChatBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }
}