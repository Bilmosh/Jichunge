package com.bill.jichunge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class About extends AppCompatActivity {

    ListView listView;

    String[] titles = {"Application Name ", "Build Version ", "Email ", "Copyright ", "Share"};

    String[] motto = {"Jichunge", "Version 2.1.2 ", "bilmosh104@gmail.com", " 2017 Jichunge Developer ","Share with friends"};

    int[] images = {R.drawable.name,
                    R.drawable.version,
                    R.drawable.email,
                    R.drawable.copy,
                    R.drawable.share};

    ArrayList<Item> data;
    CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        listView = (ListView) findViewById(R.id.listabout);

        data = new ArrayList<>();

        for (int i =0; i< 5; i ++){

            data.add(new Item(images[i],titles[i],motto[i]));
        }

        adapter = new CustomListAdapter(this,data);
        listView.setAdapter(adapter);

    }
}
