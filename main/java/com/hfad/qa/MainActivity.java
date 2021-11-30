package com.hfad.qa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonRegistration = (Button) findViewById(R.id.registration);
        buttonRegistration.setOnClickListener(this);
        Button buttonEntry = (Button) findViewById(R.id.entry);
        buttonEntry.setOnClickListener(this::OnClick1);
    }
    @Override
    public void onClick (View view)
    {Intent i;
    i= new Intent(this, Registration.class);
    startActivity(i);}

    public void OnClick1 (View view)
    {Intent b;
        b= new Intent(this, Entry.class);
        startActivity(b);}
}