package com.example.endavapracticaandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapterOrder extends RecyclerView.Adapter<MyViewHolderOrder>{

    Context context;
    List<ItemOrder> items;
    List<ItemOrder> allItems;

    public MyAdapterOrder(Context context, List<ItemOrder> items) {
        this.context = context;
        this.items = items;
        this.allItems = new ArrayList<>(items);
    }

    @NonNull
    @Override
    public MyViewHolderOrder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolderOrder(LayoutInflater.from(context).inflate(R.layout.item_view_orders,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderOrder holder, int position) {
        holder.numberOfTicketsView.setText("tickets: "+items.get(position).getNumberOfTickets());
        holder.priceView.setText("Price: "+items.get(position).getPrice());
        holder.typeTicketView.setText("Ticket Type: "+items.get(position).getTypeTicket());
        holder.eventNameView.setText(items.get(position).getEventName());
        holder.orderedAtView.setText(items.get(position).getOrderedAt());
        holder.imageViewOrder.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
