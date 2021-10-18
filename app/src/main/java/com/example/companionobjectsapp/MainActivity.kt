package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var night: ImageView
    private lateinit var morning: ImageView
    private lateinit var entry: EditText
    private lateinit var changeBackground: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        night= findViewById(R.id.night)
        morning= findViewById(R.id.morning)
        entry= findViewById(R.id.entryET)
        changeBackground= findViewById(R.id.button)

        changeBackground.setOnClickListener{
            if (entry.text.isNotBlank()){
                when {
                    entry.text.toString().equals(Values.morning,true) -> ChangeBackground.change(morning,night)
                    entry.text.toString().equals(Values.night,true) -> ChangeBackground.change(night,morning)
                    else -> Toast.makeText(this,"Please Enter Day or Night",Toast.LENGTH_SHORT).show()
                }
            }
            else
                Toast.makeText(this,"Please Enter Day or Night",Toast.LENGTH_SHORT).show()
            entry.text.clear()
        }

    }
}