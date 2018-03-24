package com.example.mpopescu.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //provide tab titles
    private String[] tabNames = {"squares", "museums", "hotels", "restaurants", "shopping"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting view pager from xml file and passing the custom adapter
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new PlaceFragmentPagerAdapter(getSupportFragmentManager()));

        //getting the tab layout from xml file and passing viewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //setting tab names
        for (int i = 0; i < tabNames.length; i++)
            tabLayout.getTabAt(i).setText(tabNames[i]);
    }
}
