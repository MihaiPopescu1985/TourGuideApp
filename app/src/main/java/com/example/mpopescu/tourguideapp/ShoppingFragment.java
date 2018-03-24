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

        View returnView = inflater.inflate(R.layout.places_list, container, false);

        ArrayList<Place> places = new ArrayList<>();

        // To be edited
        places.add(new Place("Strada Aristide Demetriade 1, Timișoara, Romania",
                "Iulius Mall Timișoara is a shopping mall located in Timișoara, Romania." +
                        " At the time of its completion it was the first shopping mall in Timișoara." +
                        " It's one of the biggest shopping centers in Romania.",
                R.drawable.mall_iulius));

        places.add(new Place("Calea Șagului 100, Timișoara, Romania",
                "Shopping City Timișoara is a shopping mall located in Timișoara, Romania." +
                        " At the time of its completion it was the second shopping mall in Timișoara.",
                R.drawable.mall_shopping_city));

        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
