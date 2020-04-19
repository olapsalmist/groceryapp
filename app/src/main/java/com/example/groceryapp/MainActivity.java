package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];
    int images[] = {R.drawable.alive,R.drawable.appleandeve,R.drawable.ariel,R.drawable.barella,R.drawable.bigoil,R.drawable.braed,R.drawable.campbellsoup,R.drawable.canola,R.drawable.chivita,R.drawable.cleanpower,R.drawable.coast,R.drawable.cowbell,R.drawable.delmonte,R.drawable.folgers,R.drawable.hollandia,R.drawable.luna,R.drawable.macleans,R.drawable.maxwell,R.drawable.nescafe,R.drawable.oats,R.drawable.oil,R.drawable.peak,R.drawable.peak2,R.drawable.peanutbutter,R.drawable.pinechunks,R.drawable.pineapple,R.drawable.punch,R.drawable.quaker,R.drawable.sweetcorn,R.drawable.tide,R.drawable.tropicana,R.drawable.twinkiescereal,R.drawable.v8,};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = getResources() .getStringArray(R.array.groceries);
        s2  = getResources() .getStringArray(R.array.Price);

        recyclerView = findViewById(R.id.recyclerview);

        RecylerAdapter recylerAdapter = new RecylerAdapter(this, s1, s2, images);
        recyclerView.setAdapter(recylerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

}
