package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Informations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

       Bundle bnd= getIntent().getExtras();
        Anime informaanime=(Anime) bnd.getSerializable("Anime");

        TextView animename= findViewById(R.id.txtname);
        animename.setText(informaanime.getAnimename().toString());

       TextView animetime= findViewById(R.id.txttime);
        animetime.setText( String.valueOf(informaanime.getAnimetime()));
        ImageView animeimage= findViewById(R.id.imageView3);
        animeimage.setImageResource(informaanime.getAnimeimge());

    }
}