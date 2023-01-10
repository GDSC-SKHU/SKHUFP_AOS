package com.example.mycloset.presentation.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.MainActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // 가입 버튼클릭이벤트리스너
        signup_btn_signup.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            //토스트메세지 출력
            Toast.makeText(this,"회원가입 되었습니다.",Toast.LENGTH_SHORT).show()
        }
    }
}