package com.protium.bmicalculator.android

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.protium.bmicalculator.Utils


class MainActivity : AppCompatActivity() {

    var heightText: EditText? = null
    var weightText: EditText? = null
    var heightStr = ""
    var weightStr = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heightText = findViewById(R.id.height)
        weightText = findViewById(R.id.weight)
        var bmiResult = findViewById<TextView>(R.id.result)
        var button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            if (TextUtils.isEmpty(heightText?.text)) {
                heightText?.error = "Field can't be empty"
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(weightText?.text)) {
                weightText?.error = "Field can't be empty"
                return@setOnClickListener
            }
            val height = heightText?.text.toString().toDouble()
            val heightM: Double = height / 100
            val weight = weightText?.text.toString().toDouble()

            bmiResult.text = Utils().calculateBMI(weight, heightM)

        }

    }
}
