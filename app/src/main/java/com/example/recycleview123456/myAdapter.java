package com.example.recycleview123456;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<MyViewholder> {

    private List<String> body;

    public myAdapter(List<String> body, List<String> title) {
        this.body = body;
        this.title = title;
    }

    private  List<String> title;
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        return  new MyViewholder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.title.setText(title.get(position));

    }

    @Override
    public int getItemCount() {
        return title.size();
    }
}
