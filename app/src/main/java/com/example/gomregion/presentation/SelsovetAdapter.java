package com.example.gomregion.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gomregion.R;
import com.example.gomregion.domain.model.Selsovet;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class SelsovetAdapter extends RecyclerView.Adapter<SelsovetAdapter.MyViewHolder> {

    private final Context context;
    private final ArrayList<Selsovet> selsovetList;

    public SelsovetAdapter(Context context, ArrayList<Selsovet> selsovetList) {
        this.context = context;
        this.selsovetList = selsovetList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cardview_item_inst, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textView.setText(selsovetList.get(position).getTitle());
        holder.imageView.setImageResource(selsovetList.get(position).getImage());

        holder.cardView.setOnClickListener(v ->
                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(selsovetList.get(position).getLink()))));
    }

    @Override
    public int getItemCount() {
        return selsovetList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView textView;
        final RoundedImageView imageView;
        final CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgInst);
            textView = itemView.findViewById(R.id.textTitle);
            cardView = itemView.findViewById(R.id.cardview_item);
        }
    }

}
