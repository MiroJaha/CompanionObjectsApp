package com.example.companionobjectsapp

import android.widget.ImageView
import androidx.core.view.isVisible

class ChangeBackground {
    companion object{
        fun change (newImage: ImageView, oldImage: ImageView){
            newImage.isVisible= true
            oldImage.isVisible= false
        }
    }
}