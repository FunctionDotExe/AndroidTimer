package com.example.timer

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val startButton = findViewById<Button>(R.id.startButton)
        val pauseButton = findViewById<Button>(R.id.pauseButton)
        val stopButton = findViewById<Button>(R.id.stopButton)

        startButton.setOnClickListener {
            Toast.makeText(this,"timer starting ",Toast.LENGTH_SHORT).show()
        }
        pauseButton.setOnClickListener {
            Toast.makeText(this ,"Timer paused ",Toast.LENGTH_SHORT).show()
        }

        stopButton.setOnClickListener {
            Toast.makeText(this ,"Timer stopped ",Toast.LENGTH_SHORT).show()
        }



    }
}