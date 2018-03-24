package com.example.mpopescu.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View returnView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Splaiul Nistrului nr 1, Timisoara , Romania",
                "Cuisine: Mediterranean, European, Fusion," +
                        " Vegetarian Friendly, Vegan Options, Gluten Free Options",
                R.drawable.restaurant_merlot));

        places.add(new Place("Strada Craiova nr. 1, Timisoara, Romania",
                "Cuisine  Seafood, Mediterranean, European, Soups," +
                        " Vegetarian Friendly, Gluten Free Options",
                R.drawable.restaurant_sabres));

        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
