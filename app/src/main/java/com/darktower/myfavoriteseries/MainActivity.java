package com.darktower.myfavoriteseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.the_stand, "The Stand", the_Stand, MyСonstants.t_The_Stand));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.the_man_in_the_high_castle, "The Man in the High Castle", the_Man_in_the_High_Castle, MyСonstants.t_The_Man_in_the_High_Castle));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.gotham, "Gotham", gotham, MyСonstants.t_Gotham));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.the_young_pope, "The Young Pope", the_Young_Pope, MyСonstants.t_The_Young_Pope));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.the_new_pope, "The New Pope", the_New_Pope, MyСonstants.t_The_New_Pope));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.peaky_blinders, "Peaky Blinders", peaky_Blinders, MyСonstants.t_Peaky_Blinders));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.el_internado, "El Internado", el_Internado, MyСonstants.t_El_Internado));
        recyclerViewItems.add( new RecyclerViewItem(R.drawable.c_r, "Castle Rock", castle_Rock, MyСonstants.t_Castle_Rock));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    String the_Stand = "\tThe Stand is a post-apocalyptic dark fantasy novel written by American author Stephen King and first published in 1978 by...";
    String the_Man_in_the_High_Castle = "\tThe Man in the High Castle is an American dystopian alternate history streaming...";
    String gotham = "\tGotham is an American action crime drama television series developed by Bruno Heller, produced by Warner Bros. Television...";
    String the_Young_Pope = "\tThe Young Pope is a drama television series created and directed by Paolo Sorrentino for Sky Atlantic, HBO, and Canal+. The series...";
    String the_New_Pope = "\tThe New Pope is a drama television series created and directed by Paolo Sorrentino for Sky Atlantic, HBO and Canal+. It is...";
    String peaky_Blinders = "\tPeaky Blinders is a British period crime drama television series created by Steven Knight. Set in Birmingham, England...";
    String el_Internado = "El Internado (The Boarding School), also known as El Internado Laguna Negra (The Black Lagoon Boarding School) is...";
    String castle_Rock = "Castle Rock is an American psychological horror anthology streaming television series, featuring and inspired by characters...";
}