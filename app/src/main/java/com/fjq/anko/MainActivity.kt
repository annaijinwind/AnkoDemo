package com.fjq.anko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fjq.anko.ui.MainUi
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUi<MainActivity>().setContentView(this)
    }

}
