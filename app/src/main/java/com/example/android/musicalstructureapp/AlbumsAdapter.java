package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsAdapter extends ArrayAdapter<Albums> {

    public AlbumsAdapter(Activity context, ArrayList<Albums> itemsAdapter) {
        super(context, 0, itemsAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Albums curentAlbum = getItem(position);

        TextView albumName = listItemView.findViewById(R.id.album_name);
        albumName.setText(curentAlbum.getAlbumName());

        TextView albumYear = listItemView.findViewById(R.id.album_year);
        albumYear.setText(curentAlbum.getmAlbumYear());

        ImageView albumImage = listItemView.findViewById(R.id.album_icon);
        albumImage.setImageResource(curentAlbum.getImageResourceId());

        return listItemView;
    }
}
