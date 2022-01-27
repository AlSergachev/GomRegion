package com.example.gomregion;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gomregion.pages.FirstFragment;
import com.example.gomregion.pages.MainFragment;
import com.example.gomregion.pages.SecondFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new FirstFragment();
            case 2:
                return new SecondFragment();
        }
        return new MainFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
