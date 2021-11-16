package com.example.du_an_1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

public class PageAdapter extends FragmentStatePagerAdapter {
    public PageAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeTabFragment();
            case 1:
                return new IbTabFragment();
            case 2:
                return new IamTabFragment();
            default:
                return new HomeTabFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
