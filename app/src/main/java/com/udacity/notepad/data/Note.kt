package com.udacity.notepad.data

import java.util.Date

// data class provides = identity (equals), hashing (hashCode), copying (copy constructors)
data class Note(
        val id: Int = -1,
        var text: String? = null,
        var isPinned: Boolean = false,
        var createdAt: Date = Date(),
        var updatedAt: Date? = null
)
