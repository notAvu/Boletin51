package com.example.boletin51;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import clases.Equipo;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Equipo[] nbaTeams={
            new Equipo("Bucks",R.drawable.bucks),
            new Equipo("Cavaliers",R.drawable.cavaliers),
            new Equipo("Celtics",R.drawable.celtics),
            new Equipo("Bulls",R.drawable.chicago),
            new Equipo("Golden State Warriors",R.drawable.gsw),
            new Equipo("Knicks",R.drawable.knicks),
            new Equipo("Mavericks",R.drawable.mavericks),
            new Equipo("Seventy Sixers",R.drawable.sevsixers),
            new Equipo("Spurs",R.drawable.spurs),
            new Equipo("Nets",R.drawable.nets),
            new Equipo("Heat",R.drawable.heat),
            new Equipo("Raptors",R.drawable.raptors),
            new Equipo("Phoenix",R.drawable.phoenix)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp= findViewById(R.id.spinTeams);
        NbaAdapter<Equipo> adapter= new NbaAdapter<>(this, R.id.list_item ,nbaTeams);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public class ViewHolder
    {
        private TextView tv;
        private ImageView img;

        public TextView getTv() {
            return tv;
        }

        public void setTv(TextView tv) {
            this.tv = tv;
        }

        public ImageView getImg() {
            return img;
        }

        public void setImg(ImageView img) {
            this.img = img;
        }

        public ViewHolder(TextView tv, ImageView img) {
            this.tv = tv;
            this.img = img;
        }
    }

    public class NbaAdapter<T> extends ArrayAdapter
    {
        Context context;
        T[] objects;

        public NbaAdapter(@NonNull Context context, int resource,  @NonNull Object[] objects) {
            super(context, resource, objects);
        }
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            View row =convertView;
            LayoutInflater inflater = getLayoutInflater();
            ViewHolder holder;
            if(row==null) {
                row=inflater.inflate(R.layout.custom_list_layout, parent, false);
                ImageView image = row.findViewById(R.id.image);
                TextView item = row.findViewById(R.id.list_item);

                item.setText(nbaTeams[position].getNombre());
                image.setImageResource(nbaTeams[position].getIdEscudo());
                holder = new ViewHolder(item, image);
            }
            else
                { holder=(ViewHolder) row.getTag(); }
            return row;
        }


    }

}