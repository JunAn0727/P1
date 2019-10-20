package com.example.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()

        val sumButton: Button = findViewById(R.id.sum_button)
        sumButton.setOnClickListener {
            val sumV = randomInt + randomInt2 + randomInt3
            val sumValue: TextView = findViewById(R.id.sumValue)
            sumValue.text = sumV.toString()
        }
    }
}
