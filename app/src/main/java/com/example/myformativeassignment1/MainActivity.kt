package com.example.myformativeassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mealChooser)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val resetButton = findViewById<Button>(R.id.resetButton)
        val mealPicker = findViewById<Button>(R.id.mealPicker)
        val timeOfMeal = findViewById<EditText>(R.id.timeOfMeal)
        val textView = findViewById<TextView>(R.id.textView)

        mealPicker.setOnClickListener{
            val timeChosen = timeOfMeal.text.toString().trim().lowercase()

            if (timeChosen == "morning") {
                textView.text = "pancakes and orange juice"
            } else if (timeChosen == "morning snack") {
                textView.text = "assorted fruits"
            } else if (timeChosen == "afternoon") {
                textView.text = "lamb shwarma with a energy drink"
            } else if (timeChosen == "afternoon snack") {
                textView.text = "energy bar with water"
            } else if (timeChosen == "night") {
                textView.text = "chicken schnitzel with soft drink"
            } else if (timeChosen == "late night snack") {
                textView.text = "tea and biscuits"

            } else {
                textView.text = "valid time required"

                resetButton.setOnClickListener {
                    timeOfMeal.text.clear()
                    textView.text = ""

                }

            }

            }
    }
}