package com.example.appda0.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.appda0.R
import com.example.appda0.databinding.ScreenHomeBinding

class HomeScreen : Fragment() {

    private lateinit var binding: ScreenHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ScreenHomeBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.yesButton.setOnClickListener {
            Toast.makeText(requireContext(),R.string.toast_yes,Toast.LENGTH_SHORT).show()
        }

        binding.noButton.setOnClickListener {
            Toast.makeText(requireContext(),R.string.toast_no,Toast.LENGTH_SHORT).show()
        }

    }



}