package com.example.mpopescu.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SquaresFragment extends Fragment {

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
        places.add(new Place(getString(R.string.victory_square),
                getString(R.string.victory_square_description),
                getString(R.string.general_square_position),
                R.drawable.square_victory));

        places.add(new Place(getString(R.string.union_square),
                getString(R.string.union_square_description),
                getString(R.string.general_square_position),
                R.drawable.union_square));

        //getting the ListView from xml file
        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
