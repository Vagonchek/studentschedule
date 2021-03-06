package com.example.studentschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studentschedule.databinding.ActivityLoginBinding

class CActivityLogin : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btLogin.setOnClickListener {
            //binding.pbLogin.visibility = View.VISIBLE
            var intent = Intent(this, CActivityMenu::class.java);
            intent.putExtra("LOGIN",binding.etLogin.text.toString())

            startActivity(intent)

        }
    }
}