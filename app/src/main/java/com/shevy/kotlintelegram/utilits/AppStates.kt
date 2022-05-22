package com.shevy.kotlintelegram.utilits

import com.shevy.kotlintelegram.database.*

enum class AppStates(val state: String) {
    ONLINE("В сети"),
    OFFLINE("был недавно"),
    TYPING("печатате...");

    companion object {
        fun updateState(appState: AppStates) {
            if (AUTH.currentUser != null) {
                REF_DATABASE_ROOT.child(NODE_USERS).child(CURRENT_UID).child(CHILD_STATE)
                    .setValue(appState.state)
                    .addOnSuccessListener { USER.state = appState.state }
                    .addOnFailureListener { showToast(it.message.toString()) }
            }
        }
    }
}