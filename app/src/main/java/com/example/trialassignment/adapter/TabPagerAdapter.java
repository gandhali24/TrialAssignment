package com.example.trialassignment.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.example.trialassignment.views.BusinessFragment;
import com.example.trialassignment.views.MerchantFragment;
import com.example.trialassignment.views.PersonalFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    Context context;
    int totalTabs;
    public TabPagerAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PersonalFragment personalFragment = new PersonalFragment();
                return personalFragment;
            case 1:
                BusinessFragment businessFragment = new BusinessFragment();
                return businessFragment;
            case 2:
                MerchantFragment merchantFragment = new MerchantFragment();
                return merchantFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;

    }
}
