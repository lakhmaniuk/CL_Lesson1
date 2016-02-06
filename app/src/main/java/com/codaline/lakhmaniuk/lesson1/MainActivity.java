package com.codaline.lakhmaniuk.lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnNarnia;
    EditText textToNarnia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnNarnia = (Button) findViewById(R.id.btn_Narnia);
        textToNarnia = (EditText)findViewById(R.id.toNarniaText);

    }

    public void goToNarnia(View view){

        Intent intent = new Intent(this,NarniaActivity.class );
        intent.putExtra("send message", textToNarnia.getText().toString());
        startActivityForResult(intent, 1);;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String name = data.getStringExtra("send message");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
