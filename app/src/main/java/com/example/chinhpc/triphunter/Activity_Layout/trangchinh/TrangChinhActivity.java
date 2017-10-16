package com.example.chinhpc.triphunter.Activity_Layout.trangchinh;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TabHost;

import com.example.chinhpc.triphunter.Adapter.ViewPagerAdapter;
import com.example.chinhpc.triphunter.R;

public class TrangChinhActivity extends AppCompatActivity implements TabHost.OnTabChangeListener, ViewPager.OnPageChangeListener, SearchView.OnQueryTextListener{
//    ListView listView;
//    SearchView searchView;
    ViewPager viewPager;
    TabHost tabHost;
    ArrayAdapter<String> adapter;
    String[] data = {"Hà Giang","Tuyên Quang","Đà Lạt","Đà Lạt","Đà Lạt","Đà Lạt"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //----------------------------------
        tabHost = (TabHost) findViewById(R.id.tap);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabHost.setup();
        //
//        listView = (ListView) findViewById(R.id.listview);
//        searchView = (SearchView) findViewById(R.id.idSearch);
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
//        listView.setAdapter(adapter);
//        searchView.setOnQueryTextListener(this);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("TripHunter");
        tab1.setIndicator("Nổi bật");
        tab1.setContent(new fContentTab(this));

        TabHost.TabSpec tab2 = tabHost.newTabSpec("TripHunter");
        tab2.setIndicator("Địa danh");
        tab2.setContent(new fContentTab(this));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

        tabHost.setOnTabChangedListener(this);
        viewPager.setOnPageChangeListener(this);

    }

    @Override
    public void onTabChanged(String s) {
        int vitritab = tabHost.getCurrentTab();
        viewPager.setCurrentItem(vitritab);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabHost.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    //Search View
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(newText);
        return false;
    }

    public class fContentTab implements TabHost.TabContentFactory{
        Context context;
        public fContentTab(Context context){
            this.context = context;
        }

        @Override
        public View createTabContent(String tag) {
            View view = new View(context);
            view.setMinimumHeight(0);
            view.setMinimumWidth(0);
            return view;
        }
    }
}
