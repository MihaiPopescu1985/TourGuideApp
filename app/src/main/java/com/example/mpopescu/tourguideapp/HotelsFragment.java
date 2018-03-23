package com.example.mpopescu.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

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
        places.add(new Place("1-3 Marasesti, 300086 Timişoara, Romania",
                "Hotel Timisoara is situated right in the centre of Timisoara," +
                        " overlooking the Opera Square and within walking distance" +
                        " from the main landmarks of the city." +
                        " It offers spacious and elegant accommodation with air conditioning" +
                        " and free WiFi internet access in all areas.",
                R.drawable.hotel_timisoara));

        places.add(new Place("Piata Mocsonyi-Sinaia, nr. 8, 300173 Timişoara, Romania",
                "Located close to the Sinaia Church in Timisoara, " +
                "Hotel Iosefin Residence can be easily accessed by public transport. " +
                "It offers elegant and classically decorated apartments and free internet access." +
                "The Iosefin Residence is near Timisoara's centre with museums," +
                " parks and a shopping centre.",
                R.drawable.hotel_iosefin_residence));

        places.add(new Place("300054 B-dul Revolutiei 1989, Nr 2A, 300054 Timişoara, Romania",
                "Located in the heart of Timisoara, Continental Hotel is next to the" +
                        " Civic Park and only a few minutes' walk from the historical Unirii Square" +
                        " and the Bastion. Housed in one of the tallest buildings in the city," +
                        " all rooms offer impressive views. The hotel boasts an in-house night club," +
                        " spa and wellness centre, and a casino.",
                R.drawable.hotel_continental));

        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
