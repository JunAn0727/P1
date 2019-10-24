package com.example.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        countup_button.setOnClickListener{ countUp() }

    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        val rt = arrayOf(resultText, resultText2, resultText3)
        for(rst in rt) {
            if (rst.text.toString().toIntOrNull() == null) {
                rst.text = "1"
            } else {
                val r1 = rst.text.toString().toInt()
                if (r1 < 6) {
                    rst.text = (r1 + 1).toString()
                } else {
                    rst.text = r1.toString()
                }
            }
        }
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

        val sumButton: Button = findViewById(R.id.reset_button)
        reset_button.setOnClickListener {
            resultText.text = "0"
            resultText2.text = "0"
            resultText3.text = "0"
        }
    }
}
