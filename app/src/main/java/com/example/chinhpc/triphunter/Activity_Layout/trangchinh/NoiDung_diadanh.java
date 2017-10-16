package com.example.chinhpc.triphunter.Activity_Layout.trangchinh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.chinhpc.triphunter.Adapter.CustomAdapter;
import com.example.chinhpc.triphunter.R;

import java.util.ArrayList;
import java.util.List;


public class NoiDung_diadanh extends AppCompatActivity{
    ListView list_diadanh;
//    int[] hinhdd = {R.drawable.diadanh1,R.drawable.diadanh2,R.drawable.diadanh3};
//    String[] tenDiaDanh = {"Mù Cang Chải","Phan Thiết-Mũi Né","Đà Lạt"};
//    String[] gioiThieu = {"đây là Mù Cang Chải","đây là Phan Thiết-Mũi Né","đây là Đà Lạt"};
    List<ListDiaDanh> lDiaDanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diadanh);
        // tìm listDiadanh bên layout
        List<ListDiaDanh> image_details = getListData();
        list_diadanh = (ListView) findViewById(R.id.listDiadanh);
        list_diadanh.setAdapter(new CustomAdapter(this, image_details));

        // Khi người dùng click vào các ListItem
        list_diadanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = list_diadanh.getItemAtPosition(position);
                ListDiaDanh country = (ListDiaDanh) o;

                Toast.makeText(NoiDung_diadanh.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
        //ListDiaDanh diadanh1 = new ListDiaDanh("")
//        lDiaDanh = new ArrayList<>();
//        for(int i = 0; i<tenDiaDanh.length; i++){
//            ListDiaDanh listDiaDanh = new ListDiaDanh();
//            listDiaDanh.setHinhAnh(hinhdd[i]);
//            listDiaDanh.setTenDiaDanh(tenDiaDanh[i]);
//            listDiaDanh.setGioiThieu(gioiThieu[i]);
//
//            lDiaDanh.add(listDiaDanh);
//        }
//        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
//        CustomAdapter adapterDiaDanh = new CustomAdapter(this,R.layout.layout_list_diadanh,lDiaDanh);
//        adapterDiaDanh.notifyDataSetChanged();
//        list_diadanh.setAdapter(adapterDiaDanh);
    }

    public List<ListDiaDanh> getListData() {
        List<ListDiaDanh> listData = new ArrayList<ListDiaDanh>();
        ListDiaDanh vietnam = new ListDiaDanh("diadanh1" ,"Mù Cang Chải","Mù Cang Chải");
        ListDiaDanh usa = new ListDiaDanh("diadanh2" , "Phan Thiết-Mũi Né","Phan Thiết-Mũi Né");
        ListDiaDanh russia = new ListDiaDanh("diadanh3" , "Đà Lạt","Đà Lạt");
        listData.add(vietnam);
        listData.add(usa);
        listData.add(russia);
        return listData;
    }
}

