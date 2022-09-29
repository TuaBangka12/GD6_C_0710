package com.example.gd6_c_0710

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent ) {
        val massage = intent.getStringExtra("toastMassage")
        Toast.makeText(context,massage, Toast.LENGTH_LONG).show()

    }
}