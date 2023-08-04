package com.example.endavapracticaandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        RecyclerView recyclerViewOrder = findViewById(R.id.recyclerViewOrder);

        List<ItemOrder> items = new ArrayList<>();
        items.add(new ItemOrder("VIP","5","Untold","2000","12-12-2023",R.drawable.untold1));
        items.add(new ItemOrder("Standard","5","Grecia","2000","12-12-2023",R.drawable.vacanta2));
        items.add(new ItemOrder("VIP","5","Untold","2000","12-12-2023",R.drawable.vacanta1));
        items.add(new ItemOrder("Standard","5","Grecia","2000","12-12-2023",R.drawable.vacanta1));
        items.add(new ItemOrder("Standard","5","Untold","1000","12-12-2023",R.drawable.untold1));
        items.add(new ItemOrder("VIP","5","Grecia","2000","12-12-2023",R.drawable.untold1));
        items.add(new ItemOrder("Standard","5","Untold","1000","12-12-2023",R.drawable.untold1));


        recyclerViewOrder.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewOrder.setAdapter(new MyAdapterOrder(getApplicationContext(),items));

        // Găsim butonul "events" și adăugăm un listener pentru evenimentul de apăsare
        Button ordersButton = findViewById(R.id.eventsOrder);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Deschidem OrdersActivity când butonul este apăsat
                Intent intent = new Intent(OrdersActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}