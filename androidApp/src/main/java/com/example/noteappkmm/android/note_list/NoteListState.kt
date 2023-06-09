package com.example.noteappkmm.android.note_list

import com.example.noteappkmm.domain.note.Note

class NoteListState(
    var notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)