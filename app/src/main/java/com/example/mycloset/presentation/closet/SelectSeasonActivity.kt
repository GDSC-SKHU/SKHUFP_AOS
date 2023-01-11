package com.example.mycloset.presentation.closet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.MainActivity
import com.example.mycloset.R
import com.example.mycloset.presentation.dailylook.AddDailylookActivity
import kotlinx.android.synthetic.main.activity_select_season.*

class SelectSeasonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_season)

        select_season_btn_spring.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_summer.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_autumn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_winter.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_etc.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        select_season_btn_dailylook.setOnClickListener {
            var intent = Intent(this, AddDailylookActivity::class.java)
            startActivity(intent)
        }
    }
}