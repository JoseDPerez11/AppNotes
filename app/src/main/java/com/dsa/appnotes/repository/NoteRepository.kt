package com.dsa.appnotes.repository

import com.dsa.appnotes.database.NoteDatabase
import com.dsa.appnotes.model.Note

class NoteRepository(private val database: NoteDatabase) {

    suspend fun insertNote(note: Note) = database.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = database.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = database.getNoteDao().updateNote(note)

    fun getAllNotes() = database.getNoteDao().gellAllNotes()
    fun searchNotes(query: String?) = database.getNoteDao().searchNote(query)

}