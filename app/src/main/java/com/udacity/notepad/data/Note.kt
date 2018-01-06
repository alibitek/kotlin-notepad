package com.udacity.notepad.data

import java.util.Date

class Note {
    var id = -1
    var text: String? = null
    var isPinned = false
    var createdAt = Date()
    var updatedAt: Date? = null
}
