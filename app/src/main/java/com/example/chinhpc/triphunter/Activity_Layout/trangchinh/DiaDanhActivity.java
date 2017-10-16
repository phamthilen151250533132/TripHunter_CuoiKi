package com.example.chinhpc.triphunter.Activity_Layout.trangchinh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.chinhpc.triphunter.R;

import java.util.List;

public class DiaDanhActivity extends Fragment {
    ListView list_diadanh;
    //    int[] hinhdd = {R.drawable.diadanh1,R.drawable.diadanh2,R.drawable.diadanh3};
//    String[] tenDiaDanh = {"Mù Cang Chải","Phan Thiết-Mũi Né","Đà Lạt"};
//    String[] gioiThieu = {"đây là Mù Cang Chải","đây là Phan Thiết-Mũi Né","đây là Đà Lạt"};
    List<ListDiaDanh> lDiaDanh;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_diadanh,container,false);
//        list_diadanh = (ListView)view.findViewById(R.id.listDiadanh);
//        List<ListDiaDanh> image_details = getListData();
//        list_diadanh.setAdapter(new CustomAdapter(this, image_details));
        return view;
    }
//    public List<ListDiaDanh> getListData() {
//        List<ListDiaDanh> listData = new ArrayList<ListDiaDanh>();
//        ListDiaDanh vietnam = new ListDiaDanh("diadanh1" ,"Mù Cang Chải","Mù Cang Chải");
//        ListDiaDanh usa = new ListDiaDanh("diadanh2" , "Phan Thiết-Mũi Né","Phan Thiết-Mũi Né");
//        ListDiaDanh russia = new ListDiaDanh("diadanh3" , "Đà Lạt","Đà Lạt");
//        listData.add(vietnam);
//        listData.add(usa);
//        listData.add(russia);
//        return listData;
//    }
}
