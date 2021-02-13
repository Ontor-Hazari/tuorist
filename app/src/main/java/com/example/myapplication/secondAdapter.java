package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class secondAdapter extends RecyclerView.Adapter<secondAdapter.Viewholder> {


    Context context;
    int[] image;
    String[] heritagedetels;
    String[] countrydetels;


    public secondAdapter(Context context, int[] image,String[] heritagedetels, String[] countrydetels) {
        this.context = context;
        this.image = image;
        this.heritagedetels = heritagedetels;
        this.countrydetels = countrydetels;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.placelayout,parent,false);

        return new secondAdapter.Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.imageView.setImageResource(image[position]);
        holder.textView.setText(heritagedetels[position]);
        holder.textView.setText(countrydetels[position]);

    }

    @Override
    public int getItemCount() {
        return heritagedetels.length;
    }

    class Viewholder extends  RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView , sectectView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.first_text);
            sectectView = itemView.findViewById(R.id.second_text);

        }
    }
}
