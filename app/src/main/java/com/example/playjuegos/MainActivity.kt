package com.example.playjuegos
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.plataformas.*
import com.example.playjuegos.R.layout.activity_main as layoutActivity_main


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutActivity_main)

        val titulo = findViewById(R.id.titulo) as TextView
        titulo.setTypeface(Typeface.createFromAsset(assets, "Courgette-Regular.ttf"))

        val jugador = findViewById(R.id.Button1) as Button
        jugador.setOnClickListener{ lanzarNewPlayer()
        }
        val preferencias = findViewById(R.id.Button2) as Button
        preferencias.setOnClickListener {
            lanzarPreferencias()
        }
        val games = findViewById(R.id.Button) as Button
        games.setOnClickListener{
            lanzarGames()
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

}
