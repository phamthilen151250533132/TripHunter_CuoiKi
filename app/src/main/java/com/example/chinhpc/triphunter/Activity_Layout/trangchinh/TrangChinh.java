package com.example.chinhpc.triphunter.Activity_Layout.trangchinh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

import com.example.chinhpc.triphunter.Activity_Layout.canhan.CaNhanActivity;
import com.example.chinhpc.triphunter.Adapter.CustomAdapter;
import com.example.chinhpc.triphunter.R;

import java.util.ArrayList;
import java.util.List;

public class TrangChinh extends AppCompatActivity {
    ListView list_diadanh;
    Toolbar toolbar;
    //    int[] hinhdd = {R.drawable.diadanh1,R.drawable.diadanh2,R.drawable.diadanh3};
//    String[] tenDiaDanh = {"Mù Cang Chải","Phan Thiết-Mũi Né","Đà Lạt"};
//    String[] gioiThieu = {"đây là Mù Cang Chải","đây là Phan Thiết-Mũi Né","đây là Đà Lạt"};
    List<ListDiaDanh> lDiaDanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        ////

        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("Nổi bật");
        tab1.setIndicator("Nổi bật");
        tab1.setContent(R.id.tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("Địa danh");
        tab2.setIndicator("Địa danh");
        tab2.setContent(R.id.tab2);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

        //////////////////////
        List<ListDiaDanh> image_details = getListData();
        list_diadanh = (ListView) findViewById(R.id.listDiadanh);
        list_diadanh.setAdapter(new CustomAdapter(this, image_details));

        // Khi người dùng click vào các ListItem
        list_diadanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = list_diadanh.getItemAtPosition(position);
                ListDiaDanh country = (ListDiaDanh) o;
                //Toast.makeText(TrangChinh.this, "Selected :" + " " + country.getTenDiaDanh(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(TrangChinh.this,ChiTietDiaDanh.class);
                intent.putExtra("extra_text", country.getTenDiaDanh());
                intent.putExtra("gioiThieu", country.getChiTiet());
                intent.putExtra("flagName", country.getFlagName());
                startActivity(intent);
            }
        });
    }
    public List<ListDiaDanh> getListData() {
        List<ListDiaDanh> listData = new ArrayList<ListDiaDanh>();
        ListDiaDanh dd1 = new ListDiaDanh("diadanh1" ,"Mù Cang Chải","Kỳ vĩ ruộng bậc thang","Mù Căng Chải là địa danh du lịch nổi tiếng nhất tỉnh Yên Bái." +
                "Cách Hà Nội khoảng 180km, thành phố Yên Bái là trung tâm chính trị, kinh tế, văn hóa của tỉnh. Trên địa bàn tỉnh có nhiều di tích lịch sử văn hóa, tôn giáo, là điểm du lịch tâm linh được rất nhiều du khách thập phương ghé thăm." +
                " Thành phố nằm bên tả ngạn sông Hồng, với cấu tạo địa hình gồm dải phù sa ven sông, đồng bằng phù sa, các đồi núi thấp, các thung lũng, khe suối xen kẽ đồi núi và cánh đồng chạy dọc theo triền sông. " +
                "Địa thế đẹp, hoang sơ và môi trường sinh thái chưa bị ô nhiễm chính là lý do hấp dẫn đối với khách du lịch. ");
        ListDiaDanh dd2 = new ListDiaDanh("diadanh2" , "Phan Thiết-Mũi Né","Thủ đô Resort ","THỜI ĐIỂM THÍCH HỢP DU LỊCH MŨI NÉ:\n" +
                "- Tháng 8 - 12: thích hợp nhất.\n" +
                "- Cuối tháng 6 - 8: nên tránh đi vì đây là mùa tảo biển nở hoa (“thủy triều đỏ”), nước biển chuyển màu, kèm theo mùi hôi.\n" +
                "- Tháng 4-5: mùa nắng nóng nhất.");

        ListDiaDanh dd3 = new ListDiaDanh("diadanh3" , "Đà Lạt","Thành phố ngàn hoa","Đà Lạt đẹp cả bốn mùa: mùa xuân hồng thắm sắc đào, mùa hè lãng mạn phượng tím, mùa thu cúc bất tử nở rộ, mùa đông vàng rực mùa hoa dã quỳ và mimosa.\n" +
                "- Tháng 1-2: Đà Lạt rộn ràng sắc xuân, trăm hoa đua nở.\n" +
                "- Tháng 3-4: thời điểm Đà Lạt nóng nhất. Lúc này cỏ cây khô héo, thời tiết oi bức hơn.\n" +
                "- Mùa hè tháng 8-10: thường có mưa rả rích. Cả Đà Lạt chìm trong khúc tình ca đẹp lạ lùng, thích hợp với những ai yêu lãng mạn. Những tháng này các vùng khác là mùa hè oi ả nên du khách tìm đến Đà Lạt nghỉ mát rất đông, mùa các đơn vị, cơ quan thường tổ chức những chuyến đi chơi.\n" +
                "- Cuối thu đầu đông cuối tháng 10-12: thời điểm lý tưởng nhất. Lúc này, những cơn mưa kéo dài đã dứt, những con gió mát ùa về mang theo cái se lạnh của ngày chớm đông, mùa hoa dã quỳ bắt đầu nở rộ khoác lên mình Đà Lạt tấm áo vàng rực rỡ.");
        listData.add(dd1);

        listData.add(dd2);

        listData.add(dd3);
        return listData;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_khac){
            Intent intent = new Intent(this, CaNhanActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
