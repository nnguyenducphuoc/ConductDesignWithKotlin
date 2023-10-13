package com.phuoc.conductdesignwithkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phuoc.conductdesignwithkotlin.databinding.ActivityMainBinding
import java.util.Formatter

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //khoi tao viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCong.setOnClickListener {
            var num1: Int = (binding.number1.text.toString()).toInt()
            var num2: Int = (binding.number2.text.toString()).toInt()
            var result: Int = num1 + num2
            binding.tvResult.text = result.toString()
        }

        binding.btnTru.setOnClickListener {
            var num1: Int = (binding.number1.text.toString()).toInt()
            var num2: Int = (binding.number2.text.toString()).toInt()
            var result: Int = num1 - num2
            binding.tvResult.text = result.toString()
        }

        binding.btnNhan.setOnClickListener {
            var num1: Int = (binding.number1.text.toString()).toInt()
            var num2: Int = (binding.number2.text.toString()).toInt()
            var result: Int = num1 * num2
            binding.tvResult.text = result.toString()
        }

        binding.btnChia.setOnClickListener {

            var num1: Double = (binding.number1.text.toString()).toDouble()
            var num2: Double = (binding.number2.text.toString()).toDouble()
            var result: Double = (num1 * 1.0) / num2
            binding.tvResult.text = String.format("%.2f", result)
        }

    }
}