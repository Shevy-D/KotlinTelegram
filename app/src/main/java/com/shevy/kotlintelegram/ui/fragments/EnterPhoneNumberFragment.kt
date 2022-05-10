package com.shevy.kotlintelegram.ui.fragments

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.R
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {
    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener { sendCode() }
    }

    private fun sendCode() {
        //val registerPhNumber = R.id.register_input_phone_number as EditText
        if (register_input_phone_number.text.toString().isEmpty()) {
            Toast.makeText(activity, R.string.register_toast_enter_phone, Toast.LENGTH_LONG).show()
        } else {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.registerDataContainer, EnterCodeFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}