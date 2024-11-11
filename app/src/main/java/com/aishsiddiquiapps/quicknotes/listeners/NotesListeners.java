package com.aishsiddiquiapps.quicknotes.listeners;

import com.aishsiddiquiapps.quicknotes.room.Note;

public interface NotesListeners {

    void onNoteClicked(Note note, int position);
}
