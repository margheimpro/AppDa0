package com.example.appda0.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appda0.databinding.ScreenSettingsBinding

class SettingsScreen : Fragment() {

    private lateinit var binding: ScreenSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ScreenSettingsBinding.inflate(inflater)
        return binding.root
    }

}