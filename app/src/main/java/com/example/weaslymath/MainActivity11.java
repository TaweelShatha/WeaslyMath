package com.example.weaslymath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity11 extends AppCompatActivity {
    RecyclerView recyclerView = findViewById(R.id.recy);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("BUNDLE");
        ArrayList<Score> ScoreArrayList = (ArrayList<Score>) args.getSerializable("ARRAYLIST");

        ScoreAdapter adapter;
        adapter = new ScoreAdapter(ScoreArrayList, this);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}