package com.example.clase5kotlin

import android.content.Context
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.example.clase5kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
val listaMutable : MutableList<Series>

var  serie1 = Series("guerra de mundos","horror",1990)

       binding.textView.setText(serie1.name.toString())

        binding.buttonFiltro.setOnClickListener {

        }
    }

    fun print (){


    }


}