package com.example.kiran.gridviewexamplechandana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> arrayList_1;
    GridView Gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList_1=new ArrayList<String>();
        Gv=(GridView)findViewById(R.id.GridView_1);
        arrayList_1.add("a");
        arrayList_1.add("b");
        arrayList_1.add("c");
        arrayList_1.add("d");
        arrayList_1.add("e");
        arrayList_1.add("f");
        arrayList_1.add("g");
        arrayList_1.add("h");
        arrayList_1.add("i");
        arrayList_1.add("j");
        arrayList_1.add("k");
        arrayList_1.add("l");
        arrayList_1.add("M");
        arrayList_1.add("N");

        ArrayAdapter<String> AAGrid=new ArrayAdapter<String>(this,R.layout.activity_main,R.id.TV_display,arrayList_1);
        Gv.setAdapter(AAGrid);
    }
}
