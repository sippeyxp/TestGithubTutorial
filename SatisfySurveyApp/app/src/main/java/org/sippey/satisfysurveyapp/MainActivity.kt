package org.sippey.satisfysurveyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var yesButton: Button
    private lateinit var noButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to UI elements
        questionTextView = findViewById(R.id.questionTextView)
        yesButton = findViewById(R.id.yesButton)
        noButton = findViewById(R.id.noButton)
        resultTextView = findViewById(R.id.resultTextView)

        // Set up OnClickListener for yesButton
        yesButton.setOnClickListener {
            resultTextView.text = getString(R.string.result_satisfied)
        }

        // Set up OnClickListener for noButton
        noButton.setOnClickListener {
            resultTextView.text = getString(R.string.result_not_satisfied)
        }
    }
}
