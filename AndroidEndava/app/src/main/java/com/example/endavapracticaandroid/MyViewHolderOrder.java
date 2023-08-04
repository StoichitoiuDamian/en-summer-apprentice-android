package com.example.endavapracticaandroid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolderOrder extends RecyclerView.ViewHolder{

    ImageView imageViewOrder;
    TextView typeTicketView,numberOfTicketsView,eventNameView,priceView,orderedAtView;

    public MyViewHolderOrder(@NonNull View itemView) {
        super(itemView);

        imageViewOrder = itemView.findViewById(R.id.imageOrder);
        eventNameView = itemView.findViewById(R.id.eventName);
        orderedAtView = itemView.findViewById(R.id.orderedAt);
        typeTicketView = itemView.findViewById(R.id.typeTicket);
        numberOfTicketsView = itemView.findViewById(R.id.numberOfTickets);
        priceView = itemView.findViewById(R.id.price);

    }
}
