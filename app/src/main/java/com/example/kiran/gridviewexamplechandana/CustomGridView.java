package com.example.kiran.gridviewexamplechandana;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;
/**
 * Created by Kiran on 18-11-2015.
 */
public class CustomGridView extends Activity {
    GridView GV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayoutchandagridviewtag);
        GV=(GridView)findViewById(R.id.GVChandana_Custom);
        CustomGridViewChandana CGVC=new CustomGridViewChandana(this);
        GV.setAdapter(CGVC);
        GV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getApplicationContext(),gridimagedisplay.class);
                i.putExtra("ima_name",position);
                startActivity(i);
            }
        });
    }
    class CustomGridViewChandana extends BaseAdapter
    {
        LayoutInflater LINF;
        Context context;
            TextView TV;
            ImageView Iv;

        CustomGridViewChandana(Context context)
        {
            this.context=context;
            LINF=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return globaldataimagename.Im_name.length;
        }
        @Override
        public Object getItem(int position) {
            return position;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=LINF.inflate(R.layout.griviewstuff,null);
            TV=(TextView)convertView.findViewById(R.id.GVStuff_tv_1);
            Iv=(ImageView)convertView.findViewById(R.id.GVstuff_iv_1);
            TV.setText(globaldataimagename.Im_name[position]);
            Iv.setImageResource(globaldataimagename.Im_array[position]);
            return convertView;
        }
    }/*CustomGridViewChandana*/
}/*class end*/
