package com.example.anime;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class Animeadapter extends ArrayAdapter {
    List<Anime> animeList;

    public Animeadapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        animeList= objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(getContext()).inflate(R.layout.poster, parent, false);



        Anime cutanime= animeList.get(position);

        TextView animeNametxt= view.findViewById(R.id.txtname);
        TextView animetime= view.findViewById(R.id.txttime);
        ImageView animeimge= view.findViewById(R.id.nimage);
        animeNametxt.setText(cutanime.getAnimename());
        animetime.setText(String.valueOf(cutanime.getAnimetime()));
        animeimge.setImageResource(cutanime.getAnimeimge());

        ImageView deleteButt= view.findViewById(R.id.delet);
        deleteButt.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View view) {
              AlertDialog.Builder alertbox = new AlertDialog.Builder(view.getRootView().getContext());
              alertbox.setMessage("Are you sure want to detele?");
              alertbox.setTitle("Delete");
              alertbox.setIcon(R.drawable.ic_baseline_delete_24);
              alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                       animeList.remove(position);
                                  notifyDataSetChanged();

                      Snackbar snackbar = Snackbar
                              .make(view, "Item is deleted", Snackbar.LENGTH_LONG)
                              .setAction("UNDO", new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Snackbar snackbar1 = Snackbar.make(view, "Item is restored!", Snackbar.LENGTH_SHORT);
                                      snackbar1.show();
                                  }
                              });

                      snackbar.show();
                  }
              });
              alertbox.setNeutralButton("No",
                      new DialogInterface.OnClickListener() {

                          public void onClick(DialogInterface arg0,
                                              int arg1) {
                              arg0.cancel();


                          }
                      });
              alertbox.show();

            }
            });

             return view;


}}



