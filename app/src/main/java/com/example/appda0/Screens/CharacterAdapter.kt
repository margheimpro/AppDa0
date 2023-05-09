package com.example.appda0.Screens

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appda0.databinding.CharacterItemBinding

class CharacterAdapter(
    private val characterList:ArrayList<Character>,
    private val listener: (Character,Int) -> Unit
): RecyclerView.Adapter<CharacterAdapter.ViewHolder>(){


    inner class ViewHolder(var characterItemBinding:CharacterItemBinding):
        RecyclerView.ViewHolder(characterItemBinding.root){
            fun bindItem(character:Character){
                characterItemBinding.image.setImageResource(character.image)
                characterItemBinding.imageDescription.text = character.name
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = CharacterItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(characterList[position])
        holder.itemView.setOnClickListener {
            listener(characterList[position],position)
        }
    }

    override fun getItemCount(): Int {
        return characterList.size
    }


}