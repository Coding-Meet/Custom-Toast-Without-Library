package com.coding.meet.customtoastwithoutlibrary

import android.content.Context
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


fun Context.simpleToastShow(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.changePositionToastShow(message: String, gravity: Int = Gravity.BOTTOM) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).apply {
        setGravity(gravity, 0, 0)
        show()
    }
}

fun Context.customToastShow(
    message: String, rootView: ViewGroup, gravity: Int = Gravity.BOTTOM,
    isImageShow: Boolean = false,
) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).apply {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            val customToastVIew = LayoutInflater.from(this@customToastShow)
                .inflate(R.layout.custom_toast_layout, rootView, false)
            if (isImageShow) {
                val appImage = customToastVIew.findViewById<ImageView>(R.id.appImage)
                appImage.visibility = View.VISIBLE
            }
            val messageTxt = customToastVIew.findViewById<TextView>(R.id.messageTxt)
            messageTxt.text = message
            view = customToastVIew
            setGravity(gravity, 0, 30)
        }
        show()
    }
}