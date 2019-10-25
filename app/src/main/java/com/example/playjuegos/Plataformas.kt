package com.example.playjuegos


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T




class Plataformas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)


        val boton = findViewById(R.id.FAB1) as FloatingActionButton
        boton.setOnClickListener(object : View.OnClickListener {



            override fun onClick(view: View) {


                val chkbox1 = findViewById(R.id.checkBox) as CheckBox
                val chkbox2 = findViewById(R.id.checkBox2) as CheckBox
                val chkbox3 = findViewById(R.id.checkBox3) as CheckBox
                val chkbox4 = findViewById(R.id.checkBox4) as CheckBox
                val chkbox5 = findViewById(R.id.checkBox5) as CheckBox
                val chkbox6 = findViewById(R.id.checkBox6) as CheckBox


                val Rtdo = StringBuilder()
                Rtdo.append("")
                if (chkbox1.isChecked()) Rtdo.append("Angry Birds ")
                if (chkbox2.isChecked()) Rtdo.append("Dragon Fly ")
                if (chkbox3.isChecked()) Rtdo.append("Hill Climbing Racing ")
                if (chkbox4.isChecked()) Rtdo.append("Radiant Defense ")
                if (chkbox5.isChecked()) Rtdo.append("Pocket Soccer ")
                if (chkbox6.isChecked()) Rtdo.append("Ninja Jump ")

                if (Rtdo.toString() == "") {

                    Rtdo.append( "No has escogido ningún juego.")
                }
                Toast.makeText(
                    applicationContext, Rtdo.toString(),
                    Toast.LENGTH_LONG
                ).show()

            }
        })



    }


}

