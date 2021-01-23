package com.workbenchstudio.gbkotlinhomework02.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.workbenchstudio.gbkotlinhomework02.R
import com.workbenchstudio.gbkotlinhomework02.databinding.ItemNoteBinding
import com.workbenchstudio.gbkotlinhomework02.models.Note

class MainPageAdapter : RecyclerView.Adapter<MainPageAdapter.NoteViewHolder>() {

    var notes: List<Note> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun getItemCount(): Int = notes.size

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ui = ItemNoteBinding.bind(itemView)

        fun bind(note: Note) {
            with(note) {
                ui.noteTitle.text = title
                ui.body.text = mainText
                itemView.setBackgroundColor(color)
            }

        }
    }
}