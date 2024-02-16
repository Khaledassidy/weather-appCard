package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView titleapp;
    RecyclerView recyclerView;
    ArrayList<weather> myarraylist;
    Myaddapter myaddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleapp=findViewById(R.id.titleapp);
        recyclerView=findViewById(R.id.rc);
        myarraylist=new ArrayList<>();
        weather weather1=new weather(R.drawable.firstimage,"Beiurt","35°","8:30 Pm",R.color.firstcolor);
        weather weather2=new weather(R.drawable.secondimage,"Zahle","15°","1:30 am",R.color.secondcolor);
        weather weather3=new weather(R.drawable.thirdimage,"Baalbeck","5°","10:30 Pm",R.color.thirdcolor);
        weather weather4=new weather(R.drawable.secondimage,"Aramoun","25°","9:30 Pm",R.color.forthcolor);
        weather weather5=new weather(R.drawable.firstimage,"Nabatieh","20°","11:30 Pm",R.color.fifthcolor);
        weather weather6=new weather(R.drawable.thirdimage,"Arz","-1°","4:30 Pm",R.color.sixcolor);
        weather weather7=new weather(R.drawable.thirdimage,"Akkar","10°","12:30 Pm",R.color.siventhcolor);

        myarraylist.add(weather1);
        myarraylist.add(weather2);
        myarraylist.add(weather3);
        myarraylist.add(weather4);
        myarraylist.add(weather5);
        myarraylist.add(weather6);
        myarraylist.add(weather7);
        LinearLayoutManager x= new LinearLayoutManager(getApplicationContext());
        myaddapter=new Myaddapter(myarraylist, new costumeclicklistner() {
            @Override
            public void onclik(int i) {
                Toast.makeText(MainActivity.this, "Location "+myarraylist.get(i).getCountryname() ,Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setLayoutManager(x);
        recyclerView.setAdapter(myaddapter);


    }
}