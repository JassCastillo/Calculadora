package com.jass.especial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edit_numero1 = findViewById(R.id.etPrimerNumero)
        var edit_numero2 = findViewById(R.id.etSegundoNumero)
    }

    public suma (int a, int b){
        return a+b;
    }
}