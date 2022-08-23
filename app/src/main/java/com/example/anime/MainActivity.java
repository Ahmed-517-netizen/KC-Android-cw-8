package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list1;
    ArrayList<Anime> animes = new ArrayList<Anime>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listiq = (ListView)findViewById(R.id.list1);

        Anime anime1= new Anime("Naruto", R.drawable.n, 2002);
        Anime anime2= new Anime("attack", R.drawable.ae, 2013);
        Anime anime3= new Anime("hyuka", R.drawable.hy, 2012);
        Anime anime4= new Anime("conan", R.drawable.dete, 1996);
        Anime anime5= new Anime("kimtsu", R.drawable.kim, 2019);
        Anime anime6= new Anime("dororo", R.drawable.doro, 2019);
        Anime anime7= new Anime("kiseijuu", R.drawable.mege, 2014);
        Anime anime8= new Anime("dragon ball", R.drawable.dragon, 1986);
        Anime anime9= new Anime("one piece", R.drawable.one, 1999);

        animes.add(anime1);
        animes.add(anime2);
        animes.add(anime3);
        animes.add(anime4);
        animes.add(anime5);
        animes.add(anime6);
        animes.add(anime7);
        animes.add(anime8);
        animes.add(anime9);

             Animeadapter animeadapter= new Animeadapter(this, 0, animes);
              ListView Listview= findViewById(R.id.list1);
              listiq.setAdapter(animeadapter);
              Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                      Anime cutanime= animes.get(i);
//                      Context context = getApplicationContext();
//                      CharSequence text = "Hello toast!";
//                      int duration = Toast.LENGTH_SHORT;
//
//                      Toast toast = Toast.makeText(context, text, duration);
//                      toast.show();
                    Intent intent=new Intent(MainActivity.this, Informations.class);

                      intent.putExtra("Anime",cutanime);
                      startActivity(intent);
                  }
              });


    }



}