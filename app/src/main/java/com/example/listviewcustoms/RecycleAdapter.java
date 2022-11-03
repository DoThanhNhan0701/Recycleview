package com.example.listviewcustoms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends  RecyclerView.Adapter<RecycleAdapter.MyViewHolder>{
    List<Country> countryList;
    Context context;

    public RecycleAdapter(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycle, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Country country = countryList.get(position);
        holder.txtPopu.setText(String.valueOf(country.getPopul()));
        holder.txtName.setText(country.getName());
        holder.imageView.setImageResource(country.getFlas());
        holder.setItemClickListener(new ItemsClick() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                String name = country.getName();
                Toast.makeText(view.getContext(), name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtName;
        TextView txtPopu;
        ImageView imageView;
        private ItemsClick itemClickListener;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtnamere);
            txtPopu = itemView.findViewById(R.id.txtpopulre);
            imageView = itemView.findViewById(R.id.imagesre);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemsClick itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false);
        }
    }
}
