package com.example.mpopescu.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        //the view to be returned
        View returnView = inflater.inflate(R.layout.places_list, container, false);
        ArrayList<Place> places = new ArrayList<>();

        //populating the array
        places.add(new Place(getString(R.string.iulius_mall),
                getString(R.string.iulius_mall_description),
                getString(R.string.iulius_mall_position),
                R.drawable.mall_iulius));

        places.add(new Place(getString(R.string.shopping_city),
                getString(R.string.shopping_city_description),
                getString(R.string.shopping_city_position),
                R.drawable.mall_shopping_city));

        //getting the ListView from xml file
        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
