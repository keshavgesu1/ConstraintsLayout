package com.example.constraintslayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.country
import kotlinx.android.synthetic.main.activity_main.dob
import kotlinx.android.synthetic.main.activity_main.firstName
import kotlinx.android.synthetic.main.activity_main.lastName
import kotlinx.android.synthetic.main.activity_main.nextButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // In java
//      val buttonApply = findViewById<Button>(R.id.nextButton)

        // In Kotlin
        nextButton.setOnClickListener {
            val firstName = firstName.text.toString()
            val lastName = lastName.text.toString()
            val dob = dob.text.toString()
            val country = country.text.toString()
           Log.d("MainActivity","$firstName $lastName, born on $dob, country $country")
        }

    }
}