package com.neppplus.librarypractice_20211204

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
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

//            권한 여부 해동 방침

            val pl = object : PermissionListener{
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:010-555-6666")

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                }


            }
            val myUri = Uri.parse("tel:010-555-0000 " )
            val myIntent = Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)
        }





    }
    fun setValuse(){
        //인터넷상에 있는 이미지를 곧바로 이미지뷰에 적용.
        //이미지 주소를 변수에 담아주자
        val imageURL = "https://dimg.donga.com/wps/NEWS/IMAGE/2019/12/31/99024137.2.jpg"
        //glide이용 이미지url주소의 그림을 imginternet에 반영

        Glide.with(this).load(imageURL).into(imgInternet)



    }
}