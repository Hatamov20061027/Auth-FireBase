package com.example.auntificationdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.auntificationdemo.databinding.ActivityMainBinding
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var auth: FirebaseAuth
    private val TAG = "PhoneActivity"
    lateinit var storedVerificationId:String
    lateinit var resendToken: PhoneAuthProvider.ForceResendingToken

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {
            if (binding.edtPhoneNumber.text.toString().trim().isNotEmpty()){
                val phoneNumber = binding.edtPhoneNumber.text.toString()
                NumberObj.number=phoneNumber
                val i = Intent(this, SmsActivity::class.java)
                startActivity(i)
            }


        }
       
    }


}