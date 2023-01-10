package com.example.mycloset.presentation.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.MainActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 로그인 버튼 클릭이벤트리스너
        login_btn_login.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            // 토스트 메세지 출력
            Toast.makeText(this,"로그인 되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}