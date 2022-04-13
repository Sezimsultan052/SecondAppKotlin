package com.example.secondappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.secondappkotlin.databinding.ActivityMainBinding
import java.net.URL
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var imgUrls: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSubmit.setOnClickListener{

            addUrls(binding.etUrl.text.toString())
            binding.etUrl.setText("")

        }

        binding.radioButton.setOnClickListener{
            binding.iv.loadUrl(getRandomUrl())

        }

    }


    private fun getRandomUrl() : String {
       return imgUrls.random()
    }

    private fun addUrls(urlValue: String) {
        if(checkingUrlValue(urlValue)) {
            imgUrls.add(urlValue)
        } else {
            makeToast(getString(R.string.empty_field))
        }

    }


    //сopied from interner)))
    private fun checkingUrlValue(url: String): Boolean = try {
        URL(url).toURI()
        true
    } catch (e: Exception) {
        false
    }


}