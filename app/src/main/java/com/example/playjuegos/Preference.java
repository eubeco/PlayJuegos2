
package com.example.playjuegos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Preference extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);




        FloatingActionButton boton = (FloatingActionButton) findViewById(R.id.FAB1);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                RadioButton radiobtn = (RadioButton) findViewById(R.id.radioButton);
                RadioButton radiobtn2 = (RadioButton) findViewById(R.id.radioButton2);
                RadioButton radiobtn3 = (RadioButton) findViewById(R.id.radioButton3);
                RadioButton radiobtn4 = (RadioButton) findViewById(R.id.radioButton4);
                RadioButton radiobtn5 = (RadioButton) findViewById(R.id.radioButton5);

                SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);

                if (radiobtn.isChecked()){
                    Toast.makeText(getApplicationContext() , "Angry Birds" + " Puntuación: " + seekBar.getProgress(), Toast.LENGTH_LONG).show();
                }else
                if (radiobtn2.isChecked()){
                    Toast.makeText(getApplicationContext() , "Dragon fly" + " Puntuación: " + seekBar.getProgress(), Toast.LENGTH_LONG).show();
                }else
                if (radiobtn3.isChecked()){
                    Toast.makeText(getApplicationContext() , "Hill climbing racing" + " Puntuación: " + seekBar.getProgress(), Toast.LENGTH_LONG).show();
                }else
                if (radiobtn4.isChecked()){
                    Toast.makeText(getApplicationContext() , "Pocket soccer" + " Puntuación: " + seekBar.getProgress(), Toast.LENGTH_LONG).show();
                }else
                if (radiobtn5.isChecked()){
                    Toast.makeText(getApplicationContext() , "Radiant defense" + " Puntuación: " + seekBar.getProgress(), Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(getApplicationContext() , "No has escogido ningún juego.", Toast.LENGTH_LONG).show();
                }

            }
        });

        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);

        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar1, float rating, boolean fromUser) {
                seekBar.setProgress((int) (rating));
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar1) {
// TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar1) {
// TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
                ratingBar.setRating((float) progress);
            }
        });
    }
}

