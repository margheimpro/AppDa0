package com.example.appda0.Screens

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.appda0.R
import com.example.appda0.databinding.ScreenRiddlesBinding
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class RiddlesScreen : Fragment() {

    private lateinit var binding: ScreenRiddlesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ScreenRiddlesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.answerButton.setOnClickListener {
            var textWritten = binding.textRiddleScreen.text as CharSequence
            binding.textComp.text = textWritten


            Snackbar.make(binding.answerButton, binding.textComp.text, Snackbar.LENGTH_SHORT).show()
            if (binding.textComp.text.contentEquals("krabby patty")) {
                Snackbar.make(
                    binding.answerButton,
                    R.string.toast_correct_Answer,
                    Snackbar.LENGTH_SHORT
                ).show()
            } else {
                Snackbar.make(
                    binding.answerButton,
                    R.string.toast_not_correct_Answer,
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
    }
}