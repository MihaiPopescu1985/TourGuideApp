package com.example.mpopescu.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    public PlaceFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 1:
                return new MuseumFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new RestaurantsFragment();
            case 4:
                return new ShoppingFragment();
            default:
                return new SquaresFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
