package com.shevy.kotlintelegram.ui.screens.groups

import androidx.recyclerview.widget.RecyclerView
import com.shevy.kotlintelegram.R
import com.shevy.kotlintelegram.models.CommonModel
import com.shevy.kotlintelegram.ui.screens.base.BaseFragment
import com.shevy.kotlintelegram.utilits.APP_ACTIVITY
import com.shevy.kotlintelegram.utilits.getPlurals
import com.shevy.kotlintelegram.utilits.hideKeyBoard
import com.shevy.kotlintelegram.utilits.showToast
import kotlinx.android.synthetic.main.fragment_create_group.*

class CreateGroupFragment(private var listContacts:List<CommonModel>)
    :BaseFragment(R.layout.fragment_create_group) {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: AddContactsAdapter

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = getString(R.string.create_group)
        APP_ACTIVITY.mAppDrawer.enableDrawer()
        hideKeyBoard()
        initRecyclerView()
        create_group_btn_complete.setOnClickListener { showToast("Click") }
        create_group_input_name.requestFocus()
        create_group_counts.text = getPlurals(listContacts.size)
    }

    private fun initRecyclerView() {
        mRecyclerView = create_group_recycle_view
        mAdapter = AddContactsAdapter()
        mRecyclerView.adapter = mAdapter
        listContacts.forEach {  mAdapter.updateListItems(it) }
    }
}