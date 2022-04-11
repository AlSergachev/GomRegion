package com.example.gomregion.presentation.pages.JustLinkFragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gomregion.R;
import com.example.gomregion.domain.model.JustLink;

import java.util.ArrayList;

public class JustLinkAdapter extends RecyclerView.Adapter<JustLinkAdapter.MyViewHolder> {

    private final ArrayList<JustLink> list;
    private final Context context;
    private int widthDisplay;
    float ratio;

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

            if (position == 0) ratio = 0.806F;
            else if (position == 1) ratio = 0.704F;
            else if (position == 8) ratio = 0.305F;
            else ratio = 0.337F;

            setImageToCard(holder, list.get(position).getImgTitle(), ratio);
            holder.cardViewTitle.setVisibility(View.VISIBLE);
            holder.icon.setVisibility(View.GONE);
        } else {
            holder.icon.setImageResource(list.get(position).getIcon());
            holder.icon.setVisibility(View.VISIBLE);
            holder.cardViewTitle.setVisibility(View.GONE);
        }
        holder.title.setText(list.get(position).getTitle());
        holder.description.setText(list.get(position).getDescription());
        holder.button.setOnClickListener(v -> context.startActivity(
                new Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getLink()))));
    }

    private void setImageToCard(MyViewHolder holder, int imgId, float ratio) {
        int heightImg = (int) (widthDisplay * ratio);
        ImageView img = new ImageView(context);
        img.setImageResource(imgId);
        holder.cardViewTitle.addView(img, widthDisplay, heightImg);
    }

    private void getWidthDisplay() {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        widthDisplay = size.x;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView title;
        final CardView cardViewTitle;
        final ImageView icon;
        final TextView description;
        final Button button;

        public MyViewHolder(View itemView) {
            super(itemView);
            getWidthDisplay();
            title = itemView.findViewById(R.id.just_title);
            description = itemView.findViewById(R.id.description);
            button = itemView.findViewById(R.id.toLink);
            cardViewTitle = itemView.findViewById(R.id.card_view_title);
            icon = itemView.findViewById(R.id.img_ic);
        }
    }
}
