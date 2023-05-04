package com.example.appda0.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appda0.databinding.ScreenProfileBinding

class ProfileScreen : Fragment() {

    private lateinit var binding: ScreenProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ScreenProfileBinding.inflate(inflater)
        return binding.root
    }

}