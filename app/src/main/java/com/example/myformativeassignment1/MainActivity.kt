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
        // This part of the code identifies each part of programs Text views, Buttons and edit view which act as a placeholder for each action.
        val resetButton = findViewById<Button>(R.id.resetButton)
        val mealPicker = findViewById<Button>(R.id.mealPicker)
        val timeOfMeal = findViewById<EditText>(R.id.timeOfMeal)
        val textView = findViewById<TextView>(R.id.textView)
        // The student manuals that was provided aswell as the lecturers slides helped me during this process.

        mealPicker.setOnClickListener{
            val timeChosen = timeOfMeal.text.toString().trim().lowercase()
            // This part of the code gives the time chosen a value to be shown on the Text view like for morning its "Pancakes and orange juice".

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
                // I have conducted this part of the code with the use of the student manuals and lecturer slides provided.

                // This part of the code is used for if a wrong input or if a misspelled time is prompted into the Edit Text it will display the text "Valid time required".
            } else {
                textView.text = "valid time required"
                // I got help with this with the use of my student material aswell as the lecturer slides provided.

                // The last part of the codes only use is for the reset button so that if a wrong input is prompted the user can just click a button to reset it.
                resetButton.setOnClickListener {
                    timeOfMeal.text.clear()
                    textView.text = ""
                    // This part of the code was done with the help of our student material and lecturer slides.

                }


            }
    }
}