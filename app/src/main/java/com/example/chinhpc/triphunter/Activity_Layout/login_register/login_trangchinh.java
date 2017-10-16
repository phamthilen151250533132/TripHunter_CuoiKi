package com.example.chinhpc.triphunter.Activity_Layout.login_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chinhpc.triphunter.Activity_Layout.canhan.CaNhanActivity;
import com.example.chinhpc.triphunter.Activity_Layout.canhan.ProfileActivity;
import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.TrangChinh;
import com.example.chinhpc.triphunter.R;

public class login_trangchinh extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack;
    private Button btnadd;
    private Button btnlogtrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_trangchinh);

        btnadd = (Button) this.findViewById(R.id.btnaddtrip);
        btnadd.setOnClickListener(this);

        btnlogtrip = (Button) this.findViewById(R.id.btn_logintrip);
        btnlogtrip.setOnClickListener(this);

        btnBack = (Button) this.findViewById(R.id.btn_back);
        btnBack.setOnClickListener( this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnaddtrip: Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent); break;

            case R.id.btn_logintrip: Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1); break;

            case R.id.btn_back: Intent intent2 = new Intent(this, CaNhanActivity.class);
                startActivity(intent2); break;
        }
    }
}
