package com.sirmothupii.encrypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //Link to take user to the navigation screen
    public void onClickSignIn(View view)
    {
        Intent intent1 = new Intent(this, SignIn.class);
        startActivity(intent1);
    }
}
