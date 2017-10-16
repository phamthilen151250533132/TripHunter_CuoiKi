package com.example.chinhpc.triphunter.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.DiaDanhActivity;
import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.NoiBatActivity;

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
