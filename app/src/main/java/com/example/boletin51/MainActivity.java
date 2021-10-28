package com.example.boletin51;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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

        NbaAdapter<Equipo> adapter= new NbaAdapter<Equipo>(this, R.id.list_item ,nbaTeams);
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
        public NbaAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Object[] objects) {
            super(context, resource, textViewResourceId, objects);
        }
        public NbaAdapter(@NonNull Context context, int resource,  @NonNull Object[] objects) {
            super(context, resource, objects);
        }
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
        {
            View view = super.getView(position, convertView, parent);

            LayoutInflater inflater= getLayoutInflater();
            inflater.inflate(R.layout.custom_list_layout, parent, false);
            TextView text= findViewById(R.id.list_item);
            ImageView iv=findViewById(R.id.image);
            ImageView image = view.findViewById(R.id.image);
            TextView item = view.findViewById(R.id.list_item);
            item.setText(nbaTeams[position].toString());
            image.setImageResource(nbaTeams[position].getIdEscudo());

            return view;
        }


    }

}