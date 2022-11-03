package com.example.listviewcustoms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Recycleview extends AppCompatActivity {
    RecyclerView recycleview;
    List<Country> countryList;
    RecycleAdapter recycleAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        mapping();
        listCount();

    }
    private void listCount(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img, 90));
        countryList.add(new Country("Mĩ Nam", R.drawable.img_1, 80));
        countryList.add(new Country("Ấn Nam", R.drawable.img, 100));
        countryList.add(new Country("Singra Nam", R.drawable.img_1, 200));
        countryList.add(new Country("vvvv Nam", R.drawable.img, 200));

        recycleAdapter = new RecycleAdapter(countryList, getApplicationContext());
        recycleview.setAdapter(recycleAdapter);


    }


    private void mapping() {
        recycleview = (RecyclerView) findViewById(R.id.recycleviewv);

        layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recycleview.setLayoutManager(layoutManager);
        recycleview.setHasFixedSize(true);
    }
}