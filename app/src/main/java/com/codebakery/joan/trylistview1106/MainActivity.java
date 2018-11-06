package com.codebakery.joan.trylistview1106;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] FRUITS = new String[]{"Apple","Abocado","Banana","Blueberry"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.listview_single_culumn,FRUITS);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
