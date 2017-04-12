package com.example.anicet.newrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<info> source = new ArrayList<>();
        source.add(new info("kokou", "marcel", "peintre"));
        source.add(new info("leon", "louis", "chauffeur"));
        source.add(new info("toto", "tata", "voyou"));
        source.add(new info("michel", "degboue", "actrice"));
        source.add(new info("jean", "louis", "maitre"));
        source.add(new info("gildas", "marron", "pretre"));

        InfoAdapter adapter = new InfoAdapter(this, source);
        RecyclerView vue = (RecyclerView) findViewById(R.id.liste);
        vue.setAdapter(adapter);
        vue.setLayoutManager(new LinearLayoutManager(this));
        

    }




}
