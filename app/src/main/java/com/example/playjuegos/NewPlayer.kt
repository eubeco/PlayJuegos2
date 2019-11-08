package com.example.playjuegos


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*


class NewPlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newplayer)


        val telefonos = arrayOf("Teléfono 1", "Teléfono 2", "Teléfono 3", "Teléfono 4", "Teléfono 5")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)

        val list_telefonos = findViewById(R.id.action_bar_spinner) as Spinner
        list_telefonos.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        list_telefonos.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val edit_telf = findViewById(R.id.EditText_Phone) as EditText
                edit_telf.setText(parent!!.getItemAtPosition(position).toString())
                /*Toast.makeText(applicationContext, parent!!.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()*/
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }


}