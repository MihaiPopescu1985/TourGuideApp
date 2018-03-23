package com.example.mpopescu.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumFragment extends Fragment {

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
        places.add(new Place("Piata Unirii Nr. 1, Timisoara, Romania",
                "http://www.muzeuldeartatm.ro/en/despre-muzeul-de-arta-timisoara/",
                R.drawable.muzeul_de_arta));

        places.add(new Place("Strada Oituz nr. 2B, Timisoara, Romania",
                "The Banat Museum occupies the entire space offered by Huniade Castle" +
                        " – the oldest documented building in Timişoara." +
                        " It was built by King Charles Robert of Anjou between" +
                        " 1307 and 1315 as a royal residence, also having military functions.",
                R.drawable.banat_museum));

        ListView listView = returnView.findViewById(R.id.places_list);
        listView.setAdapter(new PlaceAdapter(getActivity(), places));

        return returnView;
    }
}
