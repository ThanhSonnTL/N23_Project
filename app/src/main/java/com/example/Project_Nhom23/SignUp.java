package com.example.Project_Nhom23;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Project_Nhom23.Login.LoginActivity;
import com.example.kiemtra.R;

public class SignUp extends AppCompatActivity {
    private EditText editTextemail,editTextname,editTextnumber,editTextpw,editTextconfirm;
    private Button button_signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editTextemail=findViewById(R.id.editTextTextEmailAddress);
        editTextpw=findViewById(R.id.editTextTextPassword);
        editTextconfirm=findViewById(R.id.editTextTextConFirmPassword);
        editTextname=findViewById(R.id.editTextTextName);
        editTextnumber=findViewById(R.id.editTextTextNumber);

        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
