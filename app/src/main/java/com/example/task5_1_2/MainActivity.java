package com.example.task5_1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    public void createView(ArrayList<Property> propertyArrayList){
        recyclerView =  (RecyclerView) findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(propertyArrayList, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Property> propertyArrayList = new ArrayList<>();
        propertyArrayList.add(new Property("3BHK Flat Burwood", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+1","Property Price: 300,000 AUD"));
        propertyArrayList.add(new Property("2BHK Flat Melbourne", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+2","Property Price: 600,000 AUD"));
        propertyArrayList.add(new Property("3BHK Flat Sydney", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+3","Property Price: 700,000 AUD"));
        propertyArrayList.add(new Property("4BHK Flat Canberra", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+4","Property Price: 200,000 AUD"));
        propertyArrayList.add(new Property("2BHK Flat Perth", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+5","Property Price: 800,000 AUD"));
        propertyArrayList.add(new Property("5BHK Flat Box Hill", "https://dummyimage.com/800x400/aaee86fc&text=Property+Image+6","Property Price: 900,000 AUD"));
        createView(propertyArrayList);
    }
}