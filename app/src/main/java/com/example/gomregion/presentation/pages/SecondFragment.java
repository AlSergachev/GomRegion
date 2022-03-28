package com.example.gomregion.presentation.pages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gomregion.R;
import com.example.gomregion.data.DataProvider;
import com.example.gomregion.domain.model.JustLink;
import com.example.gomregion.presentation.JustLinkAdapter;
import com.example.gomregion.presentation.SelsovetAdapter;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private ArrayList<JustLink> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflaterView = inflater.inflate(R.layout.fragment_second, container, false);
        list = DataProvider.dataProviderJustLink();

        RecyclerView recyclerView = inflaterView.findViewById(R.id.recycler_view_links);
        JustLinkAdapter adapter = new JustLinkAdapter(inflaterView.getContext(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflaterView.getContext()));
        recyclerView.setAdapter(adapter);
        return inflaterView;
    }




}