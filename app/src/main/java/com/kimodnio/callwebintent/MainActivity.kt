package com.kimodnio.callwebintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonintent:Button
    lateinit var buttonweb:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncal=findViewById(R.id.btn_calc)
        buttonintent=findViewById(R.id.btnint)
        buttonweb=findViewById(R.id.btnweb)


        buttoncal.setOnClickListener{
            val calc=Intent(this,CalculatorActivity::class.java)
            startActivity(calc)
            Toast.makeText(this,"Click Me!",Toast.LENGTH_LONG).show()
        }
            buttonintent.setOnClickListener {
                val intent=Intent(this,IntentActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Click Me!",Toast.LENGTH_LONG).show()
            }
        buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
            Toast.makeText(this,"Click Me!",Toast.LENGTH_LONG).show()
        }

    }
}