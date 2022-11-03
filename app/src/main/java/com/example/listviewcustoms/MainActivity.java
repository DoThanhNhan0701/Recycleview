package com.example.listviewcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    Button button;
    List<Country> countryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        listCount();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LisviewBasic.class);
                startActivity(intent);
            }
        });
    }

    private void listCount(){
        countryList = new ArrayList<>();
        countryList.add(new Country("Việt Nam", R.drawable.ic_launcher_foreground, 90));
        countryList.add(new Country("Việt Nam", R.drawable.ic_launcher_background, 80));
        countryList.add(new Country("Việt Nam", R.drawable.ic_launcher_foreground, 100));
        countryList.add(new Country("Việt Nam", R.drawable.img, 200));
        countryList.add(new Country("Việt Nam", R.drawable.img_1, 200));

        AdapterCustom adapter = new AdapterCustom();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pos = (String) adapterView.getItemAtPosition(i);
                setTitle(pos);
            }
        });

    }

    class AdapterCustom extends BaseAdapter {
        @Override
        public int getCount() {
            return countryList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("SetTextI18n")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            View itemView = layoutInflater.inflate(R.layout.simple_country, null);

            Country c1 = countryList.get(i);
            TextView txtName = itemView.findViewById(R.id.txtname);
            TextView txtPopu = itemView.findViewById(R.id.txtpopul);
            ImageView imageView = itemView.findViewById(R.id.images);

            txtName.setText(c1.getName());
            txtPopu.setText(c1.getPopul() + "trieu nguoi");
            imageView.setImageResource(c1.getFlas());


            return itemView;
        }
    }
    private void mapping() {
        button = (Button) findViewById(R.id.button);
        listView = (ListView) findViewById(R.id.listview);
    }


}