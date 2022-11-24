package com.kimodnio.callwebintent

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class WebActivity : AppCompatActivity() {
    lateinit var mywebview:WebView
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        mywebview=findViewById(R.id.webView)

        webview()

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        mywebview.webViewClient= WebViewClient()
        mywebview.apply {
            loadUrl("https://www.emobilis.ac.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBackPressed() {
        if (mywebview.canGoBack())mywebview.goBack()else
        super.onBackPressed()
    }
}