package com.shevy.kotlintelegram.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.R
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
//
        register_input_code.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                val string = register_input_code.text.toString()
                if (string.length == 6) {
                    verifyCode()
                }
            }
        })
    }

    fun verifyCode() {
        Toast.makeText(activity, "Ok", Toast.LENGTH_LONG).show()
    }
}