package com.example.chinhpc.triphunter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:NoiBatActivity noiBatActivity = new NoiBatActivity();
                return noiBatActivity;
            case 1:DiaDanhActivity diaDanhActivity = new DiaDanhActivity();
                return diaDanhActivity;
            default: return  null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
