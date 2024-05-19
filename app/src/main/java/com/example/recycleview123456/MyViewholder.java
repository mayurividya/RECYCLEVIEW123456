package com.example.recycleview123456;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder  extends RecyclerView.ViewHolder {

    TextView title;


    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);


    }
}
