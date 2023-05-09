package com.example.appda0.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.appda0.R
import com.example.appda0.databinding.ScreenCharactersBinding
class CharactersScreen : Fragment() {


    private lateinit var binding: ScreenCharactersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ScreenCharactersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupStaggeredGridView()
    }

    private fun setupStaggeredGridView(){
        binding.recyclerview.apply {
            layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
            adapter = CharacterAdapter(createCharacterList()){character, position -> }
        }
    }
    private fun createCharacterList(): ArrayList<Character> {
        return arrayListOf(
            Character("Spongebob",R.drawable.spongebob),
            Character("Patrick",R.drawable.patrick),
            Character("Gary",R.drawable.gary),
            Character("Squiddy",R.drawable.squiddy),
            Character("Sandy",R.drawable.sandy),
            Character("Mr.Krabb",R.drawable.mrkrab),
            )
    }
}