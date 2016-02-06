package com.codaline.lakhmaniuk.lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNarnia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnNarnia = (Button) findViewById(R.id.btn_Narnia);
    }

    public void goToNarnia(View view){
        Intent intent = new Intent(this,NarniaActivity.class );
        startActivity(intent);
    }
}
