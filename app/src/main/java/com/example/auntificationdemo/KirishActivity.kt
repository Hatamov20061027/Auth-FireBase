package com.example.auntificationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.auntificationdemo.databinding.ActivityKirishBinding

class KirishActivity : AppCompatActivity() {
    lateinit var binding:ActivityKirishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityKirishBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.number.text=NumberObj.number.toString()
    }
}