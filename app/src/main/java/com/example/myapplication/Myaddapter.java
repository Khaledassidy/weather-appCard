package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myaddapter extends RecyclerView.Adapter<Myaddapter.Viewholder>{

    ArrayList<weather> myarraylist;
    costumeclicklistner c;

    public Myaddapter(ArrayList<weather> myarraylist, costumeclicklistner c) {
        this.myarraylist = myarraylist;
        this.c= c;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        Viewholder viewholder= new Viewholder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
            weather w=myarraylist.get(position);
            holder.Country_name.setText(w.getCountryname());
            holder.logo.setImageResource(w.getSrcimage());
            holder.temp.setText(w.getTempreature());
            holder.clock.setText(w.getClock());
            holder.background.setImageResource(w.getBackgroundimg());
    }

    @Override
    public int getItemCount() {
        return myarraylist.size();
    }

    public  class Viewholder extends RecyclerView.ViewHolder{
        TextView Country_name,curr_location,clock,temp,anytext;
        ImageView logo,background;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
           Country_name=itemView.findViewById(R.id.Country_name);
           curr_location=itemView.findViewById(R.id.curr_location);
           clock=itemView.findViewById(R.id.clock);
           temp=itemView.findViewById(R.id.temp);
           anytext=itemView.findViewById(R.id.anytext);
           logo=itemView.findViewById(R.id.logo);
           background=itemView.findViewById(R.id.background);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   c.onclik(getAdapterPosition());
               }
           });
        }

    }
}
