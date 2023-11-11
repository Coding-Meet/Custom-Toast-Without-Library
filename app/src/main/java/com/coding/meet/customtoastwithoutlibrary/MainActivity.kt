package com.coding.meet.customtoastwithoutlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val simpleToastBtn = findViewById<Button>(R.id.simpleToastBtn)
        simpleToastBtn.setOnClickListener {
            // if fragment and adapter use add context.simpleToastShow
            simpleToastShow("Coding Meet")
        }

        val changePosToastBtn = findViewById<Button>(R.id.changePosToastBtn)
        changePosToastBtn.setOnClickListener {
            // if fragment and adapter use add context.changePositionToastShow
            // here Default Gravity = Bottom   , TOP, START, END , CENTER
            changePositionToastShow("Coding Meet", Gravity.BOTTOM)
        }

        val customToastWithoutImageToastBtn =
            findViewById<Button>(R.id.customToastWithoutImageToastBtn)
        customToastWithoutImageToastBtn.setOnClickListener {
            // if fragment and adapter use add context.customToastShow
            // here Default Gravity = Bottom   , TOP, START, END , CENTER
            customToastShow("Coding Meet", findViewById(R.id.rootView), Gravity.BOTTOM)
        }

        val customToastWithImageToastBtn = findViewById<Button>(R.id.customToastWithImageToastBtn)
        customToastWithImageToastBtn.setOnClickListener {
            // if fragment and adapter use add context.customToastShow
            // here Default Gravity = Bottom   , TOP, START, END , CENTER
            customToastShow(
                "Coding Meet",
                findViewById(R.id.rootView),
                isImageShow = true,
                gravity = Gravity.BOTTOM
            )
        }
    }
}