package com.shevy.kotlintelegram.ui.screens.settings

import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.database.USER
import com.shevy.kotlintelegram.database.setBioToDatabase
import com.shevy.kotlintelegram.ui.screens.BaseChangeFragment
import kotlinx.android.synthetic.main.fragment_change_bio.*

class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_change_bio) {
    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDatabase(newBio)
    }
}