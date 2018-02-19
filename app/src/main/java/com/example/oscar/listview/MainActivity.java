package com.example.oscar.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adaptador;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adaptador);

        arrayList.add("onCreate");
        listView.setAdapter(adaptador);

    }



    @Override
    protected void onStart() {
        super.onStart();
        arrayList.add("onStart");
        listView.setAdapter(adaptador);
    }

    @Override
    protected void onResume() {
        super.onResume();
        arrayList.add("onResume");
        listView.setAdapter(adaptador);
    }

    @Override
    protected void onPause() {
        super.onPause();
        arrayList.add("onPause");
        listView.setAdapter(adaptador);
    }

    @Override
    protected void onStop() {
        super.onStop();
        arrayList.add("onStop");
        listView.setAdapter(adaptador);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        arrayList.add("onDestroy");
        listView.setAdapter(adaptador);
    }


}
