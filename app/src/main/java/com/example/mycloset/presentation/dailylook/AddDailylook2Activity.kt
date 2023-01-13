package com.example.mycloset.presentation.dailylook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_add_dailylook2.*

class AddDailylook2Activity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_dailylook2)

        dailylook_btn_update.setOnClickListener {
            val intent = Intent(this,DailylookActivity::class.java)
            startActivity(intent)
        }

        dailylook2_btn_clear.setOnClickListener{
            val intent = Intent(this,DailylookActivity::class.java)
            startActivity(intent)
        }
    }
}