package com.thoughtworks.notesvodqa.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thoughtworks.notesvodqa.databinding.NotesItemBinding

class NotesAdapter : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    private lateinit var binding: NotesItemBinding
    private var notes = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        binding = NotesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NotesViewHolder(binding)
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    class NotesViewHolder(
        private val binding: NotesItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(note: String) {
            binding.notesText.text = note
        }
    }

    fun setAdapterItems(notes: List<String>) {
        this.notes.clear()
        this.notes.addAll(notes)
        notifyDataSetChanged()
    }

    fun addAdapterItem(note: String) {
        this.notes.add(note)
        notifyDataSetChanged()
    }
}
