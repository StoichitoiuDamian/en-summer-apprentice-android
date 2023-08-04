package com.example.endavapracticaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends AppCompatActivity {

    private List<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        items.add(new Item("Untold","Cluj-Napoca","muzica",R.drawable.untold1));
        items.add(new Item("Vacanta Grecia","Grecia","relax",R.drawable.vacanta1));
        items.add(new Item("Vacanta Mamaia","Romania","relax",R.drawable.vacanta2));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


        // Găsim butonul "orders" și adăugăm un listener pentru evenimentul de apăsare
        Button ordersButton = findViewById(R.id.orders);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                // Deschidem OrdersActivity când butonul este apăsat
                Intent intent = new Intent(MainActivity.this, OrdersActivity.class);
                startActivity(intent);
            }
        });


        SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
                return false;
            }


        @Override
        public boolean onQueryTextChange(String newText) {
                // Apelează metoda pentru a filtra lista de obiecte după eventType
                filterItemsByEventType(newText);
                return true;
            }
        });
    }

    private void filterItemsByEventType(String eventType) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item item : items) {
            if (item.getEventType().toLowerCase().contains(eventType.toLowerCase())) {
                filteredItems.add(item);
            }
        }
        // Actualizează RecyclerView cu lista filtrată de obiecte
        MyAdapter adapter = new MyAdapter(getApplicationContext(), filteredItems);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setAdapter(adapter);
    }


    public boolean onQueryTextChange(String newText) {
        if (newText.isEmpty()) {
            // Dacă căutarea este goală, afișează toate obiectele
            RecyclerView recyclerView = findViewById(R.id.recyclerview);
            recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
        } else {
            // Apelează metoda pentru a filtra lista de obiecte după eventType
            filterItemsByEventType(newText);
        }
        return true;
    }
}
