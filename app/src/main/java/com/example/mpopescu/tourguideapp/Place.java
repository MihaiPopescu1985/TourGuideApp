package com.example.mpopescu.tourguideapp;


public class Place {

    //private variables
    private int mResourceId;
    private String mTitle;
    private String mDescription;
    private String mPosition;

    //constructor
    public Place(String title, String description, String position, int resourceId){

        mTitle = title;
        mDescription = description;
        mResourceId = resourceId;
        mPosition = position;
    }

    //getters
    public int getResourceId() {return mResourceId;}

    public String getTitle() {return mTitle;}

    public String getDescription() {return mDescription;}

    public String getPosition() {return mPosition;}
}
