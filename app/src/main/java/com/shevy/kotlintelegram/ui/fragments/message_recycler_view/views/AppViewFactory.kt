package com.shevy.kotlintelegram.ui.fragments.message_recycler_view.views

import com.shevy.kotlintelegram.models.CommonModel
import com.shevy.kotlintelegram.utilits.TYPE_MESSAGE_IMAGE

class AppViewFactory {
    companion object{
        fun getView(message: CommonModel):MessageView{
            return when(message.type){
                TYPE_MESSAGE_IMAGE -> ViewImageMessage(
                    message.id,
                    message.from,
                    message.timeStamp.toString(),
                    message.fileUrl
                )
                else -> ViewTextMessage(
                    message.id,
                    message.from,
                    message.timeStamp.toString(),
                    message.fileUrl,
                    message.text
                )
            }
        }
    }
}