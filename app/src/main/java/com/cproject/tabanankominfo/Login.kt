package com.cproject.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btn_login.setOnClickListener {
            val a = username.text.toString()
            if (username.text.toString().isEmpty()){
                username.setError("USERNAME KOSONG")
            }else if (password.text.toString().isEmpty()){
                password.setError("PASSWORD KOSONG")
            }else if (username.text.toString() != "Candra" && password.text.toString() !="123"){
                Toast.makeText(this, "Username & Password Anda Salah", Toast.LENGTH_LONG).show()
            }else if((a == "Candra" && password.text.toString() == "123")){

            //membawa "username" id ke main activity
            val data = Intent( this, MainActivity::class.java)
            data.putExtra("username", username.text.toString())
            startActivity(data)
            }

        }

    }
}