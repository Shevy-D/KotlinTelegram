package com.shevy.kotlintelegram.ui.screens

import android.view.*
import androidx.fragment.app.Fragment
import com.shevy.kotlintelegram.MainActivity
import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.utilits.APP_ACTIVITY
import com.shevy.kotlintelegram.utilits.hideKeyBoard

open class BaseChangeFragment (layout: Int) : Fragment(layout) {

    override fun onStart() {
        super.onStart()
        setHasOptionsMenu(true)
        APP_ACTIVITY.mAppDrawer.disableDrawer()
        hideKeyBoard()
    }

    override fun onStop() {
        super.onStop()
        APP_ACTIVITY.mAppDrawer.enableDrawer()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        (activity as MainActivity).menuInflater.inflate(R.menu.settings_menu_confirm, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings_confirm_change -> change()
        }
        return true
    }

    open fun change() {
    }
}

