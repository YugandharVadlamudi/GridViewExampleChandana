package com.example.kiran.gridviewexamplechandana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Kiran on 24-11-2015.
 */
public class gridimagedisplay extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageviewdisplay);
        Intent i=getIntent();
        ImageView iv=(ImageView)findViewById(R.id.imageviewgrid);
        iv.setImageResource(globaldataimagename.Im_array[i.getIntExtra("ima_name",0)]);
    }
}
