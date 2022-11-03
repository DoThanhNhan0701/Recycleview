package com.example.listviewcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LisviewBasic extends AppCompatActivity {
    ListView listView;
    List<String> name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisview_basic);
        listView = (ListView) findViewById(R.id.lisviewBAsic);
        data();
    }
    private void showMessages(String messages){
        Toast.makeText(getApplicationContext(), messages, Toast.LENGTH_SHORT).show();
    }

    private void data() {
        name = new ArrayList<>();
        name.add("Việ Nam");
        name.add("Ấn độ");
        name.add("China");
        name.add("Lào");
        name.add("Campuchiaa");
        name.add("Columbia");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pos = (String) adapterView.getItemAtPosition(i);
                setTitle(pos);
            }
        });
    }

}