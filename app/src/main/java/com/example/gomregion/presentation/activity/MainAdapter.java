package com.example.gomregion.presentation.activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gomregion.presentation.pages.SelsovetFragment.SelsovetFragment;
import com.example.gomregion.presentation.pages.MainFragment.MainFragment;
import com.example.gomregion.presentation.pages.JustLinkFragment.JustLinkFragment;

public class MainAdapter extends FragmentStateAdapter {
    public MainAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1)
            return new SelsovetFragment();
        else if (position == 2) {
            return new JustLinkFragment();
        } else {
            return new MainFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
