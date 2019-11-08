package com.example.playjuegos

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.core.view.get

class About: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        val listaUsers = findViewById(R.id.listusers) as ListView
        val cabecera = layoutInflater.inflate(R.layout.header_list, null)
        listaUsers.addHeaderView(cabecera)


        val usuarios = ArrayList<AndroidVersion>()
        usuarios.add(AndroidVersion("María Mata", R.drawable.ballena))
        usuarios.add(AndroidVersion("Antonio Sanz", R.drawable.margaritas ))
        usuarios.add(AndroidVersion("Carlos", R.drawable.bosque))
        usuarios.add(AndroidVersion("Berta", R.drawable.rocosas))
        usuarios.add(AndroidVersion("Hector Campos", R.drawable.rio))
        usuarios.add(AndroidVersion("Ismael", R.drawable.sunset))
        usuarios.add(AndroidVersion("Eugenia", R.drawable.tucan))



        val adaptador = VersionesAdapter(this, usuarios)

        listaUsers.adapter=adaptador

        listaUsers.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                var tupla_sel = usuarios.get(position-1)
                Toast.makeText(this@About, tupla_sel.nombre, Toast.LENGTH_SHORT).show()

            }
        })

    }
}