package com.example.chinhpc.triphunter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChinhPC on 10/1/2017.
 */

public class NoiDung_diadanh extends Activity {
    ListView list_diadanh;
    int[] hinhdd = {R.drawable.diadanh1,R.drawable.diadanh2,R.drawable.diadanh3};
    String[] tenDiaDanh = {"Mù Cang Chải","Phan Thiết-Mũi Né","Đà Lạt"};
    String[] gioiThieu = {"đây là Mù Cang Chải","đây là Phan Thiết-Mũi Né","đây là Đà Lạt"};
    List<ListDiaDanh> lDiaDanh;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // tìm listDiadanh bên layout
        list_diadanh = findViewById(R.id.listDiadanh);

        lDiaDanh = new ArrayList<>();
        for(int i = 0; i<tenDiaDanh.length; i++){
            ListDiaDanh listDiaDanh = new ListDiaDanh();
            listDiaDanh.setHinhAnh(hinhdd[i]);
            listDiaDanh.setTenDiaDanh(tenDiaDanh[i]);
            listDiaDanh.setGioiThieu(gioiThieu[i]);

            lDiaDanh.add(listDiaDanh);
        }
    }
}
