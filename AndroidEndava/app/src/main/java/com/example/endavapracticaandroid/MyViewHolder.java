package com.example.endavapracticaandroid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView eventView,locationView,descriptionView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        //itemEvent
        imageView = itemView.findViewById(R.id.imageview1);
        eventView = itemView.findViewById(R.id.eventType);
        locationView = itemView.findViewById(R.id.location);
        descriptionView = itemView.findViewById(R.id.description);

    }
}
