package com.example.lab5

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class student (val id:String, val name:String, val age:Int) : Parcelable {

}