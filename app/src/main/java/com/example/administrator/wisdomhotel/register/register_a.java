package com.example.administrator.wisdomhotel.register;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.wisdomhotel.R;

public class register_a extends AppCompatActivity {


    private Button sendCode_btn;
    private Button verification_btn;
    private EditText number_editT;
    private EditText verificationCode_editT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_a);

        sendCode_btn = findViewById(R.id.sendCode_btn);
        verification_btn= findViewById(R.id.verification_btn);
        number_editT = findViewById(R.id.number_editT);
        verificationCode_editT = findViewById(R.id.verificationCode_editT);

    }
}
