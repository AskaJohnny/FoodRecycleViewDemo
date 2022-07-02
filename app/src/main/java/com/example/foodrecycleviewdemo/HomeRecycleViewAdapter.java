package com.example.foodrecycleviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeRecycleViewAdapter extends RecyclerView.Adapter<HomeRecycleViewAdapter.HomeViewHolder> {

    List<FoodEntity> foodEntityList;

    public HomeRecycleViewAdapter(List<FoodEntity> foodEntityList) {
        this.foodEntityList = foodEntityList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_item, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        FoodEntity foodEntity = foodEntityList.get(position);
        holder.leftFoodImageView.setImageResource(foodEntity.getImageUrl());
        holder.leftHeadImageView.setImageResource(foodEntity.getImageHeader());
        holder.leftTextView.setText(foodEntity.getName());
    }

    @Override
    public int getItemCount() {
        return foodEntityList.size();
    }

    static class HomeViewHolder extends RecyclerView.ViewHolder {
        ImageView leftFoodImageView;
        ImageView leftHeadImageView;
        TextView leftTextView;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            leftFoodImageView = itemView.findViewById(R.id.left_food);
            leftHeadImageView = itemView.findViewById(R.id.left_head);
            leftTextView = itemView.findViewById(R.id.textView);
        }
    }
}
