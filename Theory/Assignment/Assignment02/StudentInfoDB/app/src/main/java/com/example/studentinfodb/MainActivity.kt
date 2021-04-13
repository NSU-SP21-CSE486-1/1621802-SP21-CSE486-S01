package com.example.studentinfodb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // floating button
        val fab: View = findViewById(R.id.floating_button)
        fab.setOnClickListener {
            Intent(this, InsertActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}