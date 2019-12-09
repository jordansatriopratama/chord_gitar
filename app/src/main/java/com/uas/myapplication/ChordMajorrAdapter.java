package com.uas.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class ChordMajorrAdapter extends RecyclerView.Adapter<ChordMajorrAdapter.ViewHolder> {

    private Context context;
    private List<ChordMajorr> list;
    RequestOptions option;

    public ChordMajorrAdapter(Context context, List<ChordMajorr> list) {
        this.context = context;
        this.list = list;
        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_chordmajor, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ChordMajorr obj = list.get(position);
        holder.chord.setText(obj.getChord());
        holder.jenis.setText(obj.getJenis());
        /*holder.deskripsi.setText(obj.getDeskripsi());
        Glide.with(context).load(list.get(position).getGambar_url()).apply(option).into(holder.gambar);*/
        Glide.with(context).load(list.get(position).getPoster_url()).apply(option).into(holder.poster);

        holder.box_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListChordMajorActivity.class);

                intent.putExtra("chord", obj.getChord());
                intent.putExtra("jenis", obj.getJenis());
                intent.putExtra("deskripsi", obj.getDeskripsi());
                intent.putExtra("gambar", obj.getGambar_url());
                intent.putExtra("poster", obj.getPoster_url());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView chord;
        private TextView jenis;
        private TextView deskripsi;
        private ImageView gambar;
        private ImageView poster;
        private LinearLayout box_linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chord = itemView.findViewById(R.id.chord);
            jenis = itemView.findViewById(R.id.jenis);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.gambar);
            poster = itemView.findViewById(R.id.poster);
            box_linear = itemView.findViewById(R.id.box_linear);
        }
    }
}
