package com.example.gomregion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gomregion.databinding.ActivityMainBinding;
import com.example.gomregion.utilities.Links;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        setAdapter();
        setTabLayout();
    }

    private void setAdapter(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentAdapter = new FragmentAdapter(fragmentManager, getLifecycle());
        binding.pager.setAdapter(fragmentAdapter);
    }

    private void setTabLayout(){
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Главная страница"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Сельсоветы в социальных сетях"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Сельские исполнительные комитеты в социальных сетях"));
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        binding.pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position));
            }
        });
    }

    private void setListeners() {
        binding.icTelegram.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_TG_REGION))));
        binding.icInstagram.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INSTAGRAM))));
        binding.icYoutube.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_YOUTUBE))));
        binding.icOk.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_OK))));
        binding.icVk.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_VK))));
        binding.icTiktok.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_TIKTOK))));
        binding.icFacebook.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_FACEBOOK))));

    }

}