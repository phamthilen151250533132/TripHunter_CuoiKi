package com.example.chinhpc.triphunter.Activity_Layout.canhan;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.chinhpc.triphunter.R;


public class ProfileActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String dulieu[] = {"Thêm địa điểm","Thông báo","Đánh giá ứng dụng","Tìm bạn bè","Cài đặt"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dulieu);
        setListAdapter(adapter);
    }
}
