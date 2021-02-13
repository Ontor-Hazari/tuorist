package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class thirdrcycelerAdapter extends RecyclerView.Adapter<thirdrcycelerAdapter.ViewHolder> {

  Context context;
  int[] icon;
  String[] listview;
  String[] doller;

    public thirdrcycelerAdapter(Context context, int[] icon, String[] listview, String[] doller) {
        this.context = context;
        this.icon = icon;
        this.listview = listview;
        this.doller = doller;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View VH = LayoutInflater.from(context).inflate(R.layout.listlayout,parent,false);

        return new thirdrcycelerAdapter.ViewHolder(VH);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

           holder.imageView.setImageResource(icon[position]);
           holder.textView.setText(listview[position]);
           holder.ttextView.setText(doller[position]);

    }

    @Override
    public int getItemCount() {
        return listview.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView,ttextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.firstimage);
            textView = itemView.findViewById(R.id.placeid);
            ttextView = itemView.findViewById(R.id.monyeid);
        }
    }
}
