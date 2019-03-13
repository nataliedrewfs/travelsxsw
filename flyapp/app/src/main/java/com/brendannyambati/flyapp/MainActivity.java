package com.brendannyambati.flyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void show_result(View view){
        EditText textView = (EditText) findViewById(R.id.DestinationEditText);
        String city=textView.getText().toString();
        Log.i("myTag", city);
        Intent myIntent = new Intent(MainActivity.this, Result.class);
        MainActivity.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
