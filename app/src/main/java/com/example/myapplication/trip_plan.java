package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class trip_plan extends RecyclerView .Adapter <trip_plan.ViewHolder>{
    Context context;
    String[] time_day;
    String[]  day_place;
    int[] t_trigoanal;

    public trip_plan(Context context,String[] time_day, String[] day_place, int[] t_trigoanal) {
        this.context = context;
        this.time_day = time_day;
        this.day_place = day_place;
        this.t_trigoanal = t_trigoanal;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Vh = LayoutInflater.from(context).inflate(R.layout.tourtime,parent,false);
        return new trip_plan.ViewHolder(Vh);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(time_day[position]);
        holder.sec_textView.setText(day_place[position]);
        holder.imageView.setImageResource(t_trigoanal[position]);

    }

    @Override
    public int getItemCount() {
        return time_day.length;
    }

    class ViewHolder extends  RecyclerView.ViewHolder {

        TextView textView,sec_textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


               textView = itemView.findViewById(R.id.tuor_time);
               sec_textView = itemView.findViewById(R.id.tuor_place);
               imageView = itemView.findViewById(R.id.trigonal);
        }
    }
}
