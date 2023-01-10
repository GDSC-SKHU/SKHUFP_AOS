package com.example.mycloset

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.presentation.login.LoginActivity
import com.example.mycloset.presentation.login.SignupActivity
import kotlinx.android.synthetic.main.activity_start.*



class StartActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // 로그인 버튼 클릭이벤트리스너
        start_btn_login.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        // 회원가입 버튼 클릭이벤트리스너
        start_btn_signup.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}