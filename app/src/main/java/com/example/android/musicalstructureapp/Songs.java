package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Intent intent = getIntent();
        int index = intent.getExtras().getInt("position");
        Albums albums = intent.getParcelableExtra("albumObject");
        int imageRes = albums.getImageResourceId();
        String aName = albums.getAlbumName();

        ListView listView = findViewById(R.id.song_list);

        TextView albumName = findViewById(R.id.album_name);
        ImageView albumImage = findViewById(R.id.album_icon);
        albumImage.setImageResource(imageRes);
        albumName.setText(aName);

        if (index == 0) {
            ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(Songs.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.album_ptx));
            listView.setAdapter(songsAdapter);

            Toast.makeText(getBaseContext(), "love " + index + " #", Toast.LENGTH_SHORT).show();
        } else if (index == 1) {
            ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(Songs.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.album_pentatonixChrismas));
            listView.setAdapter(songsAdapter);

        } else if (index == 2) {
            ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(Songs.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.album_pentatonix));
            listView.setAdapter(songsAdapter);

        } else if (index == 3) {
            ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(Songs.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.album_pentatonixChrismas));
            listView.setAdapter(songsAdapter);
        }


    }

    public void back(View v) {
        Intent intent = new Intent(Songs.this, Pentatonix.class);
        startActivity(intent);
    }

}
