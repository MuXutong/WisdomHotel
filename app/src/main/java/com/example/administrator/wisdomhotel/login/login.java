package com.example.administrator.wisdomhotel.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.wisdomhotel.R;
import com.example.administrator.wisdomhotel.register.register_a;

public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login_btn;
    private Button forgetPass_btn;
    private Button registered_btn;
    private Button serviceText_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registered_btn=findViewById(R.id.registered_btn);

        registered_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,register_a.class));
            }
        });
    }
}
