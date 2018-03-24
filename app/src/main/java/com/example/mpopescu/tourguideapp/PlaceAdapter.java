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
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity activity, ArrayList<Place> places) {

        super(activity, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View returnedListView = convertView;
        if (returnedListView == null) {

            returnedListView = LayoutInflater.from(getContext()).
                    inflate(R.layout.place, parent, false);
        }
        //getting the current Place
        Place currentPlace = getItem(position);

        //setting the image, title, position and description of current place
        if (currentPlace != null) {
            ImageView imageView = returnedListView.findViewById(R.id.place_image);
            if (currentPlace.getResourceId() != -1)
                imageView.setImageResource(currentPlace.getResourceId());

            TextView textView = returnedListView.findViewById(R.id.place_title);
            textView.setText(currentPlace.getTitle());

            textView = returnedListView.findViewById(R.id.place_position);
            textView.setText(currentPlace.getPosition());

            textView = returnedListView.findViewById(R.id.place_description);
            textView.setText(currentPlace.getDescription());
        }

        return returnedListView;
    }
}
