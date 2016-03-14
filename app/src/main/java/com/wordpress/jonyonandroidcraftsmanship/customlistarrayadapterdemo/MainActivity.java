package com.wordpress.jonyonandroidcraftsmanship.customlistarrayadapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String[] titles=null;
    private String[] descriptions=null;
    private int[] images=null;
    private ListView lvCustom;
    private CustomArrayAdapter customArrayAdapter;
    private MyListItemClickListener myListItemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        titles=getResources().getStringArray(R.array.titles);
        descriptions=getResources().getStringArray(R.array.descriptions);
        images= new int[]{R.drawable.title1,
                R.drawable.title2,
                R.drawable.title3,
                R.drawable.title4,
                R.drawable.title5,
                R.drawable.title6,
                R.drawable.title7,
                R.drawable.title8,
                R.drawable.title9,
                R.drawable.title10,
                R.drawable.title11,
                R.drawable.title12,
                R.drawable.title13,
                R.drawable.title14,
                R.drawable.title15,
                R.drawable.title16,
                R.drawable.title17,
                R.drawable.title18,
                R.drawable.title19,
                R.drawable.title20};
        lvCustom= (ListView) findViewById(R.id.lvCustom);
        customArrayAdapter=new CustomArrayAdapter(this,titles,descriptions,images);
        myListItemClickListener=new MyListItemClickListener();
        lvCustom.setAdapter(customArrayAdapter);
        lvCustom.setOnItemClickListener(myListItemClickListener);
    }

    private class MyListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView tv= (TextView) view.findViewById(R.id.tvTitle);
            Logger.toast(MainActivity.this,tv.getText().toString()+" "+ position);
        }
    }

}
