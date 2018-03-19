package com.example.mpopescu.tourguideapp;

/**
 * Created by MPopescu on 18-Mar-18.
 */

public class Place {

    private int mResourceId;
    private String mAdout;
    private String mDescription;

    public Place(String about, String description, int resourceId){

        mAdout = about;
        mDescription = description;
        mResourceId = resourceId;
    }

    public Place(String about, String description){

        mResourceId = -1;
        mDescription = description;
        mAdout = about;
    }

    public int getResourceId() {return mResourceId;}

    public String getAbout() {return mAdout;}

    public String getDescription() {return mDescription;}
}
