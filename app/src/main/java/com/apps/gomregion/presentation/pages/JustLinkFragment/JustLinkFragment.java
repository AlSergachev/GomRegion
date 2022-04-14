package com.apps.gomregion.presentation.pages.JustLinkFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.gomregion.R;
import com.apps.gomregion.data.DataProvider;
import com.apps.gomregion.domain.model.JustLink;

import java.util.ArrayList;

public class JustLinkFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflaterView = inflater.inflate(R.layout.fragment_second, container, false);
        ArrayList<JustLink> list = DataProvider.dataProviderJustLink();
        setAdapter(inflaterView, list);
        return inflaterView;
    }

    private void setAdapter(View inflaterView, ArrayList<JustLink> list) {
        RecyclerView recyclerView = inflaterView.findViewById(R.id.recycler_view_links);
        JustLinkAdapter adapter = new JustLinkAdapter(inflaterView.getContext(), list);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflaterView.getContext()));
        recyclerView.setAdapter(adapter);
    }
}