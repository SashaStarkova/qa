package com.hfad.qa;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {
    private EditText nickname, phone_num, password;
    private DatabaseReference MyDatabase;
    private String USER_KEY = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
    }
    public void init()
    {nickname= findViewById(R.id.nickname);
    phone_num=findViewById(R.id.phone_num);
    password=findViewById(R.id.password);
    MyDatabase= FirebaseDatabase.getInstance().getReference(USER_KEY);
    }
    public void onClickSave(View view){

    }
}