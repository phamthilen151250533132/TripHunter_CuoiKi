package com.example.chinhpc.triphunter.Activity_Layout.canhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chinhpc.triphunter.Activity_Layout.login_register.login_trangchinh;
import com.example.chinhpc.triphunter.R;

public class CaNhanActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_nhan);

        btnlogin = (Button) this.findViewById(R.id.btnloginmain);
        btnlogin.setOnClickListener(this);
    }
    public void onClick(View view) {

        Intent intent = new Intent(this,login_trangchinh.class);
        startActivity(intent);
    }
}
