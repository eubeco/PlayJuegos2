package com.example.playjuegos
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

import com.example.playjuegos.R.layout.activity_main as layoutActivity_main


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutActivity_main)

        val titulo = findViewById(R.id.titulo) as TextView
        titulo.setTypeface(Typeface.createFromAsset(assets, "Courgette-Regular.ttf"))

        val jugador = findViewById(R.id.Button1) as com.google.android.material.button.MaterialButton
        jugador.setOnClickListener{ lanzarNewPlayer()
        }
        val preferencias = findViewById(R.id.Button2) as com.google.android.material.button.MaterialButton
        preferencias.setOnClickListener {
            lanzarPreferencias()
        }
        val games = findViewById(R.id.Button) as com.google.android.material.button.MaterialButton
        games.setOnClickListener{
            lanzarGames()
        }
        val btn_about = findViewById(R.id.Button3) as com.google.android.material.button.MaterialButton
        btn_about.setOnClickListener{
            lanzarAbout()
        }




        val topBar = findViewById(R.id.toolbar) as androidx.appcompat.widget.Toolbar
        setSupportActionBar(topBar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.getItemId()
        if(id==R.id.action_buscar) {
            lanzarPlataformas()
        }

        return super.onOptionsItemSelected(item)
    }

    fun lanzarNewPlayer(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarPreferencias(){
        val j = Intent(this, Preference::class.java)
        startActivity(j)
    }

    fun lanzarGames(){
        val k = Intent(this, Games::class.java)
        startActivity(k)
    }
    fun lanzarPlataformas(){
        /*Toast.makeText(this, "Lanzar Plataformas", Toast.LENGTH_LONG).show()*/
        val l = Intent(this, Plataformas::class.java)
        startActivity(l)
    }
    fun lanzarAbout(){
        val m = Intent(this, About::class.java)
        startActivity(m)
    }

}
