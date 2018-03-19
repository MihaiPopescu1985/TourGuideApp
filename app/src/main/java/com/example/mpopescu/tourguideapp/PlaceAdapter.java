package com.example.mpopescu.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.ArrayList;

/**
 * Created by Mihai on 19.03.2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Activity activity, ArrayList<Place> places) {

        super(activity, 0, places);
    }

    /**
     public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


     if (listView == null){
     listView = LayoutInflater.from(getContext()).inflate(
     R.layout.songs, parent, false);
     }
     Song currentSong = getItem(position);

     TextView textView = listView.findViewById(R.id.song_title);
     textView.setText(currentSong.getTitle());

     textView = listView.findViewById(R.id.song_author);
     textView.setText(currentSong.getAuthor());

     return listView;
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View returnedListView = convertView;
        if (returnedListView == null){

            returnedListView = LayoutInflater.from(getContext()).
                    inflate(R.layout.place, parent, false);
        }
        Place currentPlace = getItem(position);
        ImageView imageView = returnedListView.findViewById(R.id.pl)

        return returnedListView;
    }
}
