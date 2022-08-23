package com.example.anime;

import java.io.Serializable;

public class Anime implements Serializable {

    private String animename;
    private int animephoto;
    private int animetime;
    public Anime(String animename, int animeimge, int animetime ) {
        this.animename = animename;
        this.animephoto = animeimge;
        this.animetime = animetime;
    }


    public String getAnimename() {
        return animename;
    }

    public void setAnimename(String animename) {
        this.animename = animename;
    }

    public int getAnimeimge() {
        return animephoto;
    }

    public void setAnimeimge(int animeimge) {
        this.animephoto = animeimge;
    }

    public int getAnimetime() {
        return animetime;
    }

    public void setAnimetime(int animetime) {
        this.animetime = animetime;
    }
}
