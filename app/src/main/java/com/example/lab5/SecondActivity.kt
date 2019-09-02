package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data =intent.extras
        var newstudent = data?.getParcelable<student>("stdData")
        idText.text="Student ID : ${newstudent?.id}"
        nameText.text = "Student Name : ${newstudent?.name}"
        ageText.text = "Student Age : ${newstudent?.age}"
    }
    fun onClickClose(view:View){
        finish()
    }
}
