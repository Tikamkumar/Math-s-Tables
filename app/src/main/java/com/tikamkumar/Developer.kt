package com.tikamkumar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.tikamkumar.tables.MainActivity
import com.tikamkumar.tables.R

class Developer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
        val back : ImageButton = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this@Developer, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onBackPressed() {
        val intent = Intent(this@Developer, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}