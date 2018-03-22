package com.example.mpopescu.tourguideapp;


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
