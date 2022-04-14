package com.apps.gomregion.presentation.pages.MainFragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.apps.gomregion.domain.utilities.Links;
import com.apps.gomregion.R;

public class MainFragment extends Fragment {

    AppCompatButton btnAppeals;
    CardView card;
    ImageView img;
    View mainView;
    int widthDisplay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mainView = view;
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getWidthDisplay();
        setImages();
        btnAppeals = view.findViewById(R.id.btn_appeals);
        setListeners();
    }

    private void setImages() {
        setImageToCard(R.drawable.img_header, R.id.card_0, 0.402F);
        setImageToCard(R.drawable.img_2, R.id.card_1, 0.428F);
        setImageToCard(R.drawable.img_3, R.id.card_2, 0.562F);
        setImageToCard(R.drawable.img_4, R.id.card_3, 0.563F);
    }

    private void setImageToCard(int imgId, int cardId, float ratio) {
        int heightImg = (int) (widthDisplay * ratio);
        card = mainView.findViewById(cardId);
        img = new ImageView(mainView.getContext());
        img.setImageResource(imgId);
        card.addView(img, widthDisplay, heightImg);
    }

    private void getWidthDisplay() {
        WindowManager wm = (WindowManager) requireContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        widthDisplay = size.x;
    }

    private void setListeners() {
        btnAppeals.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_FOR_APPEALS))));
    }
}