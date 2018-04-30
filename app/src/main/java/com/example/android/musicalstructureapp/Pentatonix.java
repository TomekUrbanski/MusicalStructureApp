package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Pentatonix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        final ArrayList<Albums> albums = new ArrayList<Albums>();
        albums.add(new Albums("PTX, Vols. 1&2", "2014", R.drawable.ptx));
        albums.add(new Albums("That`s Christmas to Me", "2014", R.drawable.christmaspenta));
        albums.add(new Albums("Pentatonix", "2015", R.drawable.pentatonixpenta));
        albums.add(new Albums("A Pentatonix Christmas", "2016", R.drawable.achristmaspenta));

        final AlbumsAdapter itemsAdapter = new AlbumsAdapter(this, albums);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(Pentatonix.this, Songs.class);
                intent.putExtra("position", listView.indexOfChild(view));
                intent.putExtra("albumObject", itemsAdapter.getItem(i));
                startActivity(intent);
            }
        });

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pentatonix.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }



}
