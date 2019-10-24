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
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        /*countup_button.setOnClickListener{ countUp() }
        reset_button.setOnClickListener {
            val resultText: TextView = findViewById(R.id.result_text)
            val resultText2: TextView = findViewById(R.id.result_text2)
            val resultText3: TextView = findViewById(R.id.result_text3)
            resultText.text = "0"
            resultText2.text = "0"
            resultText3.text = "0"
        }*/
    }

    private fun countUp() {
        /*val resultText: TextView = findViewById(R.id.result_text)
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
        }*/
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}
