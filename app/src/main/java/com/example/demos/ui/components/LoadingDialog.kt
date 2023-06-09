package com.example.demos.ui.components

import android.app.Activity
import android.app.AlertDialog
import com.example.demos.R

class LoadingDialog(val myActivty:Activity) {
    private lateinit var isdialog:AlertDialog
    fun startLoading(){
        val inflater = myActivty.layoutInflater
        val dialogView = inflater.inflate(R.layout.loading_dialog, null)
        val builder = AlertDialog.Builder(myActivty)

        builder.setView(dialogView)
        builder.setCancelable(false)
        isdialog = builder.create()
        isdialog.show()
    }
    fun isDismiss(){
        isdialog.dismiss()
    }
}