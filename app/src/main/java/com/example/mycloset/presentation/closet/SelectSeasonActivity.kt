package com.example.mycloset.presentation.closet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.MainActivity
import com.example.mycloset.R
import com.example.mycloset.presentation.dailylook.AddDailylookActivity
import com.example.mycloset.presentation.dailylook.DailylookActivity
import kotlinx.android.synthetic.main.activity_select_season.*

class SelectSeasonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_season)

        select_season_btn_spring.setOnClickListener {
            var intent = Intent(this, SpringClosetActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_summer.setOnClickListener {
            var intent = Intent(this, SummerClosetActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_autumn.setOnClickListener {
            var intent = Intent(this, AutumnClosetActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_winter.setOnClickListener {
            var intent = Intent(this, WinterClosetActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_etc.setOnClickListener {
            var intent = Intent(this, EtcClosetActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_dailylook.setOnClickListener {
            var intent = Intent(this, DailylookActivity::class.java)
            startActivity(intent)
        }
    }
}