package com.example.appda0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appda0.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainButton.setOnClickListener{view ->
            Snackbar.make(view, R.string.text_for_SnackBar,Snackbar.LENGTH_LONG).
                    setAction("Action", null).show()
        }
    }
}