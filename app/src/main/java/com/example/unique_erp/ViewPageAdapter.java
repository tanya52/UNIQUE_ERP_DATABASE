package com.example.unique_erp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> fragmentTitle = new ArrayList<>();
//     int[] imagelist={R.drawable.ic_baseline_home_24,R.drawable.call,R.drawable.course,R.drawable.website,R.drawable.location,R.drawable.name};

    public ViewPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public ViewPageAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void add(Fragment fragment, String title) {
        fragments.add(fragment);
        fragmentTitle.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return fragmentTitle.get(position);
//      Drawable drawable= ContextCompat.getDrawable(getAppplicationContext(),imagelist[position]);
//     drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
//        SpannableString spannableString=new SpannableString("   " + stringArrayList.get(position));
    }
}

