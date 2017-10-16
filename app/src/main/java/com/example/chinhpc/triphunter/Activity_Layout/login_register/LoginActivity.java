package com.example.chinhpc.triphunter.Activity_Layout.login_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chinhpc.triphunter.Activity_Layout.main.MainActivity;
import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.TrangChinh;
import com.example.chinhpc.triphunter.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    private Button btndangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnBack = (Button) this.findViewById(R.id.btn_back);
        btnBack.setOnClickListener( this);

        btndangnhap = (Button) findViewById(R.id.btndangnhap);
        btndangnhap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_back: Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent); break;
            case R.id.btndangnhap: Intent intent1 = new Intent(this, TrangChinh.class);
                startActivity(intent1); break;
        }
    }
}
