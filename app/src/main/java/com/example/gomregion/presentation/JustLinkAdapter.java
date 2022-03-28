package com.example.gomregion.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_just_link, parent, false);
        return new JustLinkAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.description.setText(list.get(position).getDescription());
        holder.button.setOnClickListener(v -> context.startActivity(
                new Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getLink()))));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView title;
        final TextView description;
        final Button button;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.just_title);
            description = itemView.findViewById(R.id.description);
            button = itemView.findViewById(R.id.toLink);
        }
    }
}
