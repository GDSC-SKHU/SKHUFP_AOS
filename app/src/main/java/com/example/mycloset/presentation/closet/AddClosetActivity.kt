package com.example.mycloset.presentation.closet

import android.content.Intent
import android.Manifest
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.mycloset.R
import kotlinx.android.synthetic.main.activity_add_closet.*
import coil.load
import com.example.mycloset.MainActivity

class AddClosetActivity :AppCompatActivity() {
    private val permissionList = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
    private val checkPermission = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { result ->
        result.forEach {
            if(!it.value) {
                Toast.makeText(applicationContext, "권한 동의 필요!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
    private val readImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        add_closet_iv.load(uri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_closet)

        checkPermission.launch(permissionList)
        add_closet_btn_image.setOnClickListener {
            readImage.launch("image/*")
        }

        add_closet_btn_add_closet.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            // 토스트 메세지 출력
            Toast.makeText(this,"옷이 등록되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}