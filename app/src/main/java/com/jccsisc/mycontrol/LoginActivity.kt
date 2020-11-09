package com.jccsisc.mycontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.jccsisc.mycontrol.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = DataBindingUtil.setContentView<ActivityLoginBinding>(
                this, R.layout.activity_login).apply {
            this.lifecycleOwner = this@LoginActivity
        }

        binding.btnLogin.setOnClickListener {
            Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show()
        }

    }

}