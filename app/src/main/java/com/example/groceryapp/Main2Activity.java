package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
            ImageView mainImageView;
            TextView Title, Price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainImageView = findViewById(R.id.mainImageView);
        Title = findViewById(R.id.Title);
        Price = findViewById(R.id.Price);
    }

    private void getDat(){

    }

    private void setData(){

    }
}
