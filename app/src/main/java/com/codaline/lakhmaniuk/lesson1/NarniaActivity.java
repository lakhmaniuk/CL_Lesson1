package com.codaline.lakhmaniuk.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NarniaActivity extends AppCompatActivity {

    Button backTTRW;
    EditText textFromNarnia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.narnia_activity);

        backTTRW = (Button) findViewById(R.id.btn_Back);
        textFromNarnia = (EditText)findViewById(R.id.fromNarniaText);
        Intent intent = getIntent();
        String inMessage = intent.getStringExtra("send message");
        Toast.makeText(this,inMessage, Toast.LENGTH_SHORT).show();


    }

    public void backTTRW(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("send message", textFromNarnia.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }

}
