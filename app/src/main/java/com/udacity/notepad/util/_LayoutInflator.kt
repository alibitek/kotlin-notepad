package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

// extension functions allow you to extend an existing class with new functionality. Pretty powerful stuff!
val Context.layoutInflator
    get() : LayoutInflater = LayoutInflater.from(this)