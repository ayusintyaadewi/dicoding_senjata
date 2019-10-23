package com.example.asus.senjatakhasindonesia;

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

import java.util.ArrayList;

public class ListSenjataAdapter extends RecyclerView.Adapter<ListSenjataAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Senjata> listSenjata;

    public ListSenjataAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Senjata> getListSenjata() {
        return listSenjata;
    }

    void setListSenjata(ArrayList<Senjata> listSenjata){
        this.listSenjata = listSenjata;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_senjata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListSenjataAdapter.ListViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext())
                .load(getListSenjata().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(getListSenjata().get(position).getNama());
        holder.tvDetail.setText(getListSenjata().get(position).getDetail());

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(context, MoveToDetail.class);
                s.putExtra("nama", getListSenjata().get(position).getNama());
                s.putExtra("detail", getListSenjata().get(position).getDetail());
                s.putExtra("photo", getListSenjata().get(position).getPhoto());
                context.startActivity(s);
            }
        });

        holder.all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(context, MoveToDetail.class);
                s.putExtra("nama", getListSenjata().get(position).getNama());
                s.putExtra("detail", getListSenjata().get(position).getDetail());
                s.putExtra("photo", getListSenjata().get(position). getPhoto());
                context.startActivity(s);
            }
        });

    }

    @Override
    public int getItemCount() {

        return listSenjata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        LinearLayout all;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_nama_senjata);
            tvDetail = itemView.findViewById(R.id.tv_detail_senjata);
            all = itemView.findViewById(R.id.linear_layout);
        }
    }
}
