package com.kimodnio.callwebintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var TextAnswer: TextView
    lateinit var FirstNumber: EditText
    lateinit var SecondNumber: EditText
    lateinit var buttonadd: Button
    lateinit var buttonsubtract: Button
    lateinit var buttonmultiply: Button
    lateinit var buttondivide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        TextAnswer=findViewById(R.id.txt_Answer)
        FirstNumber=findViewById(R.id.editTextNumber)
        SecondNumber=findViewById(R.id.editTextNumber2)
        buttonadd = findViewById(R.id.btn_add)
        buttonsubtract = findViewById(R.id.btn_subtract)
        buttondivide = findViewById(R.id.button14)
        buttonmultiply = findViewById(R.id.button13)

        buttonadd.setOnClickListener {
            var myfirstnumber = FirstNumber.text.toString()
            var mysecondnumber = SecondNumber.text.toString()

            if (myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()) {
                TextAnswer.text = "Please fill in all inputs"
            } else {
                var myanswer = myfirstnumber.toDouble() + mysecondnumber.toDouble()
                TextAnswer.text = myanswer.toString()
            }
        }
        buttonsubtract.setOnClickListener {
            var myfirstnumber=FirstNumber.text.toString()
            var mysecondnumber=SecondNumber.text.toString()

            if (myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }

        }
        buttonmultiply.setOnClickListener {
            var myfirstnumber=FirstNumber.text.toString()
            var mysecondnumber=SecondNumber.text.toString()

            if(myfirstnumber.isEmpty()or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please Fill in all Inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
        buttondivide.setOnClickListener {
            var myfirstnumber=FirstNumber.text.toString()
            var mysecondnumber=SecondNumber.text.toString()

            if(myfirstnumber.isEmpty() or  mysecondnumber.isEmpty()){
                TextAnswer.text="Please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
    }
}