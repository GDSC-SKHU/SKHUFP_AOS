package com.example.mycloset.presentation.dailylook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_dailylook.*

class DailylookActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dailylook)

        dailylook_btn_add.setOnClickListener {
            var intent = Intent(this,AddDailylookActivity::class.java)
            startActivity(intent)
        }
    }
}