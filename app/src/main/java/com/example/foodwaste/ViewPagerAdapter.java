package com.example.foodwaste;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    // tab titles
    private String[] tabTitles = new String[]{"List", "Map"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // overriding getPageTitle()
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new ListView();
                break;
            case 1:
                fragment = new MapView();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
