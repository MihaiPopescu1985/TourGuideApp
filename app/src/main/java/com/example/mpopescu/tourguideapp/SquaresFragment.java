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

        View returnView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();

        // To be edited
        places.add(new Place("Timisoara, Romania", "Victoriei Square, formerly" +
                " Opera Square, is one of the central squares of Timisoara, " +
                "the place where Timisoara was proclaimed on December 20, 1989," +
                " the first free city in Romania.",
                R.drawable.square_victory));

        places.add(new Place("Timisoara, Romania",
                "Union Square is the oldest market in Timisoara, decorated in Baroque style.\n" +
                        "Throughout its history, the market has also been called Hauptplatz," +
                        " Domplatz and Losonczy Square (after the name of Stefan Losonczy," +
                        " killed in 1552 when the fortress was conquered by the Turks)." +
                        " The name of Unirii Square was given to him in 1919, " +
                        "because the Romanian troops that entered Timisoara stopped here.",
                R.drawable.union_square));



        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
