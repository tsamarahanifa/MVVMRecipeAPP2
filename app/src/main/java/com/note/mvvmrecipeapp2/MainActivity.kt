package com.note.mvvmrecipeapp2

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent {
           Column (
               modifier = Modifier.padding(16.dp)
           ) {
               Text(text = "HAI")
               Spacer(modifier = Modifier.padding(top=10.dp))
               Button(
                   onClick = {}
               ) {
                   Text(text = "A BUTTON")
               }
           }
       }
    }
}
