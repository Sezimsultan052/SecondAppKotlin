package com.example.secondappkotlin

import android.accounts.AccountManager.get
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso
import android.content.Context


    fun ImageView.loadUrl(url: String){
        Picasso.get().load(url).into(this)
    }

    fun Context.makeToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
