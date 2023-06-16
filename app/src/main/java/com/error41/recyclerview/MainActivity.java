package com.error41.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // 1-AdapterView :   RecyclerView
    RecyclerView recyclerView;
    // 2- Data Source :

    VaccineModel [] myListData;

    // 3- Adapter
    MyAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        myListData = new VaccineModel[]{
                new VaccineModel("ASif",R.drawable.asif),
                new VaccineModel("ASif",R.drawable.fahad),
                new VaccineModel("ASif",R.drawable.fariya),
                new VaccineModel("ASif",R.drawable.galib),
                new VaccineModel("ASif",R.drawable.hasibur),
                new VaccineModel("ASif",R.drawable.humayun),
                new VaccineModel("ASif",R.drawable.niloy),
                new VaccineModel("ASif",R.drawable.oishee),
                new VaccineModel("ASif",R.drawable.rayhan),
                new VaccineModel("ASif",R.drawable.asif),

        };



        // adapter

        adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


        // Handling the Click Events


        
    }
}