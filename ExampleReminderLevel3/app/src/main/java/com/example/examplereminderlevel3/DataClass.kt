package com.example.examplereminderlevel3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Reminder(val reminderText: String) : Parcelable
