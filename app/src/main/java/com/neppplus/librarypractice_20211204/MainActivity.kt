package com.neppplus.librarypractice_20211204

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValuse()
    }

    fun setupEvents(){
        
        btnCall.setOnClickListener {
//            전화 연결 해도 되는 지 권한 확인 -ok일대만 전화연결
            val myUri = Uri.parse("tel:010-555-0000 " )
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)
        }

        imgPrifile.setOnClickListener{
            val myIntent = Intent(this, viewPhotoActivity::class.java)
        }


    }
    fun setValuse(){

    }
}