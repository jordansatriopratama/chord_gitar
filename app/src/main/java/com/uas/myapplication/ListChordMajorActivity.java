package com.uas.myapplication;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class ListChordMajorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chordmajor);

        getSupportActionBar().hide();

        String chord = getIntent().getExtras().getString("chord");
        String jenis  = getIntent().getExtras().getString("jenis");
        String deskripsi = getIntent().getExtras().getString("deskripsi");
        String gambar_url  = getIntent().getExtras().getString("gambar");
        String poster_url = getIntent().getExtras().getString("poster") ;

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_chord = findViewById(R.id.chord);
        TextView tv_jenis = findViewById(R.id.jenis);
        TextView tv_deskripsi = findViewById(R.id.deskripsi);
        ImageView gambar = findViewById(R.id.gambar);
        ImageView poster = findViewById(R.id.poster);


        tv_chord.setText(chord);
        tv_jenis.setText(jenis);
        tv_deskripsi.setText(deskripsi);

        collapsingToolbarLayout.setTitle(chord);


        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);


        Glide.with(this).load(poster_url).apply(requestOptions).into(poster);
        Glide.with(this).load(gambar_url).apply(requestOptions).into(gambar);


    }
}
