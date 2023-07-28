package com.thoughtworks.notesvodqa.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _notes = MutableLiveData<List<String>>().apply {
        value = getDummyNotes()
    }
    val notes: MutableLiveData<List<String>> = _notes

    private fun getDummyNotes(): List<String> {
        return listOf(
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
            "This is Notes\nThis is Notes Description",
        )
    }
}
