package com.anonimodiabo.tabviewdemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int mTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int Tabs) {
        super(fm);
        this.mTabs = Tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FirstFragment Tab1 = new FirstFragment();
                return Tab1;
            case 1:
                SecondFragment Tab2 = new SecondFragment();
                return Tab2;
            case 2:
                ThirdFragment Tab3 = new ThirdFragment();
                return Tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTabs;
    }
}
