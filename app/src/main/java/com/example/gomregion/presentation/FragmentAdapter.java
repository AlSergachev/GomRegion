package com.example.gomregion.presentation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gomregion.presentation.pages.FirstFragment;
import com.example.gomregion.presentation.pages.MainFragment;
import com.example.gomregion.presentation.pages.SecondFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1)
            return new FirstFragment();
        else {
            return new MainFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
