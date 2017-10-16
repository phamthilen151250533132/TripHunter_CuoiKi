package com.example.chinhpc.triphunter.Activity_Layout.trangchinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chinhpc.triphunter.R;

import org.w3c.dom.Text;

public class ChiTietDiaDanh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_dia_danh);
        String text = getIntent().getStringExtra("extra_text");
        String text2 = getIntent().getStringExtra("gioiThieu");

        Toast.makeText(this, text +" ", Toast.LENGTH_LONG).show();
        TextView txtTenDiaDanh = (TextView)findViewById(R.id.txtTenDiaDanh);
        txtTenDiaDanh.setText(text);

        ImageView imgHinhAnh = (ImageView) findViewById(R.id.imgHinhAnh);
        int imageId = this.getMipmapResIdByName(getIntent().getStringExtra("flagName"));
        imgHinhAnh.setImageResource(imageId);

        TextView txtChiTiet = (TextView)findViewById(R.id.txtchiTiet);
        txtChiTiet.setText(text2);
    }
    private int getMipmapResIdByName(String hinhAnh) {
        String pkgName = getApplicationContext().getPackageName();
        // Trả về 0 nếu không tìm thấy.
        int resID = getApplicationContext().getResources().getIdentifier(hinhAnh, "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ hinhAnh+"==> Res ID = "+ resID);
        return resID;
    }}
