package com.example.application3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRecyclerAdapter;
    ArrayList<RecyclerViewItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        data = new ArrayList<>();

        addItem("이진영", "Zoey", "010-5293-2639");
        Log.d("##", "onCreate: data "+data);
        mRecyclerAdapter = new RecyclerViewAdapter(data);


        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerAdapter.notifyDataSetChanged();


    }

    private void addItem(String name, String engName, String telNum) {
        RecyclerViewItem item = new RecyclerViewItem();

        item.setName(name);
        item.setEngName(engName);
        item.setTelNum(telNum);

        data.add(item);
    }
}