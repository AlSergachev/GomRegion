package com.example.gomregion.presentation.pages.JustLinkFragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gomregion.R;
import com.example.gomregion.domain.model.JustLink;

import java.util.ArrayList;

public class JustLinkAdapter extends RecyclerView.Adapter<JustLinkAdapter.MyViewHolder> {

    private final ArrayList<JustLink> list;
    private final Context context;

    public JustLinkAdapter(Context context, ArrayList<JustLink> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_just_link, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (list.get(position).isTitle()) {
            holder.imgTitle.setImageResource(list.get(position).getImgTitle());
            holder.imgTitle.setVisibility(View.VISIBLE);
            holder.icon.setVisibility(View.GONE);
        }else {
            holder.icon.setImageResource(list.get(position).getIcon());
            holder.icon.setVisibility(View.VISIBLE);
            holder.imgTitle.setVisibility(View.GONE);
        }
        holder.title.setText(list.get(position).getTitle());
        holder.description.setText(list.get(position).getDescription());
        holder.button.setOnClickListener(v -> context.startActivity(
                new Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getLink()))));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView title;
        final ImageView imgTitle;
        final ImageView icon;
        final TextView description;
        final Button button;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.just_title);
            description = itemView.findViewById(R.id.description);
            button = itemView.findViewById(R.id.toLink);
            imgTitle = itemView.findViewById(R.id.img_title);
            icon = itemView.findViewById(R.id.img_ic);
        }
    }
}
