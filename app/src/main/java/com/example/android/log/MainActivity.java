package com.example.android.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void printToLogs(View view) {
        TextView v1 = (TextView)findViewById(R.id.menu_item_1);
        Log.i("first",v1.getText().toString());
        TextView v2 = (TextView)findViewById(R.id.menu_item_2);
        Log.i("first",v2.getText().toString());
        TextView v3 = (TextView)findViewById(R.id.menu_item_3);
        Log.i("first",v3.getText().toString());


    }
}
