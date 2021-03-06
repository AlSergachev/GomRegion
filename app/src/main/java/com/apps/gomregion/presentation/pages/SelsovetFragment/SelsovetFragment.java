package com.apps.gomregion.presentation.pages.SelsovetFragment;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.apps.gomregion.R;
import com.apps.gomregion.data.DataProvider;
import com.apps.gomregion.domain.model.Selsovet;

import java.util.ArrayList;

@SuppressWarnings({"FieldCanBeLocal", "SameParameterValue"})
public class SelsovetFragment extends Fragment {

    private final int WIDTH_ITEM = 170;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflaterView = inflater.inflate(R.layout.fragment_first, container, false);
        ArrayList<Selsovet> selsovetList = DataProvider.dataProviderSelsovet();
        setAdapter(inflaterView, selsovetList);
        return inflaterView;
    }

    private void setAdapter(View inflaterView, ArrayList<Selsovet> selsovetList) {
        RecyclerView recyclerView = inflaterView.findViewById(R.id.recycler_view_inst);
        SelsovetAdapter adapter = new SelsovetAdapter(inflaterView.getContext(), selsovetList);
        recyclerView.setLayoutManager(new GridLayoutManager(inflaterView.getContext(), getCollum()));
        recyclerView.setAdapter(adapter);
    }

    private int getCollum() {
        WindowManager wm = (WindowManager) requireContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x / dpToPx(WIDTH_ITEM);
    }

    private int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
    }

}