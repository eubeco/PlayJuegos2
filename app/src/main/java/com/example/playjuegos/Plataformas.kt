package com.example.playjuegos


import android.annotation.SuppressLint
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
import android.os.Handler
import android.widget.Button
import androidx.core.view.marginBottom
import androidx.core.view.setPadding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.snackbar.Snackbar


class Plataformas : AppCompatActivity() {
    private val handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plataformas)

        val FAB = findViewById(R.id.FAB) as FloatingActionButton
        val bar = findViewById(R.id.Bar) as BottomAppBar
        setSupportActionBar(bar)


        FAB.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                val mySnackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout),
                    R.string.snackbar , Snackbar.LENGTH_SHORT)
                mySnackbar.setAction("Action",View.OnClickListener {

                })
                mySnackbar.show()
            }
        })







        val chip_3ds = findViewById(R.id.chip_3ds) as Chip
        val chip_pc = findViewById(R.id.chip_pc) as Chip
        val chip_ps4 = findViewById(R.id.chip_ps4) as Chip
        val chip_wii = findViewById(R.id.chip_wii) as Chip
        val chip_wiiu = findViewById(R.id.chip_wiiu) as Chip
        val chip_x360 = findViewById(R.id.chip_x360) as Chip
        val chip_xbox = findViewById(R.id.chip_xbox) as Chip

        val chipGroup = findViewById(R.id.chip_group_plataformas) as ChipGroup

        chip_3ds.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

                Toast.makeText(
                    applicationContext, R.string._3ds,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
        chip_pc.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.pc,
                    Toast.LENGTH_LONG
                ).show()
            }

        })
        chip_ps4.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.ps4,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
        chip_wii.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.wii,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
        chip_wiiu.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.wiiu,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
        chip_x360.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.x360,
                    Toast.LENGTH_LONG
                ).show()

            }
        })
        chip_xbox.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {


                Toast.makeText(
                    applicationContext, R.string.xbox,
                    Toast.LENGTH_LONG
                ).show()

            }
        })


        val btn_accion = findViewById(R.id.button1) as Button
        val btn_aventura = findViewById(R.id.button2) as Button
        val btn_deportes = findViewById(R.id.button3) as Button
        val btn_disparos = findViewById(R.id.button4) as Button
        val btn_estrategia = findViewById(R.id.button5) as Button
        val btn_lucha = findViewById(R.id.button6) as Button
        val btn_musical = findViewById(R.id.button7) as Button
        val btn_rol = findViewById(R.id.button8) as Button
        val btn_simulacion = findViewById(R.id.button9) as Button

        btn_accion.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.acci_n,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_aventura.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.aventura,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_deportes.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.deportes,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_disparos.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.disparos,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_estrategia.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.estrategia,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_lucha.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.lucha,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_musical.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.musical,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_rol.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.rol,
                    Toast.LENGTH_LONG
                ).show()
            }
        })
        btn_simulacion.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(
                    applicationContext, R.string.simulaci_n,
                    Toast.LENGTH_LONG
                ).show()
            }
        })




    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_bottombar,menu)
        return true
    }

}


