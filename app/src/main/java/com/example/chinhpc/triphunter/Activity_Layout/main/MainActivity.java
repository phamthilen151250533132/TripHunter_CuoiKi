package com.example.chinhpc.triphunter.Activity_Layout.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chinhpc.triphunter.Activity_Layout.canhan.CaNhanActivity;
import com.example.chinhpc.triphunter.Activity_Layout.login_register.LoginActivity;
import com.example.chinhpc.triphunter.Activity_Layout.login_register.RegisterActivity;
import com.example.chinhpc.triphunter.Activity_Layout.login_register.login_trangchinh;
import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.TrangChinh;
import com.example.chinhpc.triphunter.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBoqua;
    private Button btnLogin;
    private Button btnRegister;
    private Button coTK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        btnBoqua = (Button) this.findViewById(R.id.btn_Boqua);
        btnBoqua.setOnClickListener(this);
        //Tìm btnLogin  bên layout
        btnLogin = (Button) this.findViewById(R.id.btn_Logins);
        btnLogin.setOnClickListener(this);
        //
        btnRegister = (Button) this.findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
        //
        coTK = (Button) this.findViewById(R.id.btn_coTK);
        coTK.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_Boqua: Intent intent = new Intent(this, TrangChinh.class);
                startActivity(intent); break;
            case R.id.btn_Logins: Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1); break;
            case R.id.btn_register: Intent intent2 = new Intent(this, RegisterActivity.class);
                startActivity(intent2); break;
            case R.id.btn_coTK: Intent intent3 = new Intent(this, CaNhanActivity.class);
                startActivity(intent3); break;
        }
    }
}
