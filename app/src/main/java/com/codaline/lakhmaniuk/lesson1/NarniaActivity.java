package com.codaline.lakhmaniuk.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NarniaActivity extends AppCompatActivity {

    Button backTTRW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.narnia_activity);


        backTTRW = (Button) findViewById(R.id.btn_Back);


    }

    public void backTTRW(View view){
        Intent intent = new Intent(this, MainActivity.class);
        finish();

    }

}
