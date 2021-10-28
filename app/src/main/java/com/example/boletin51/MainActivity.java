package com.example.boletin51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import clases.Equipo;

public class MainActivity extends AppCompatActivity {

    Equipo[] nbaTeams={
            new Equipo("Bucks",R.drawable.bucks),
            new Equipo("Celtics",R.drawable.celtics),
            new Equipo("Bulls",R.drawable.chicago),
            new Equipo("Golden State Warriors",R.drawable.gsw),
            new Equipo("Knicks",R.drawable.knicks),
            new Equipo("Maverics",R.drawable.mavericks),
            new Equipo("Seventy Sixers",R.drawable.sevsixers),
            new Equipo("Spurs",R.drawable.spurs),
            new Equipo("Nets",R.drawable.nets),
            new Equipo("Cavaliers",R.drawable.cavaliers),
            new Equipo("Heat",R.drawable.heat),
            new Equipo("Raptors",R.drawable.raptors),
            new Equipo("Phoenix",R.drawable.phoenix)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}