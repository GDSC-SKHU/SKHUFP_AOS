package com.example.mycloset.presentation.closet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_add_closet.*

class AddClosetActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_closet)

        add_closet_btn_add_closet.setOnClickListener{
            var intent = Intent(this,ClosetDetailActivity::class.java)
            startActivity(intent)
        }
    }
}