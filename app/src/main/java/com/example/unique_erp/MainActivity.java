package com.example.unique_erp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPageAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.ic_baseline_home_24,
            R.drawable.website,
            R.drawable.course,R.drawable.hatt,R.drawable.register,R.drawable.call};
    private Toolbar tool_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);

        tool_bar=findViewById(R.id.tool_bar);
        //setSupportActionBar(tool_bar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        //setSupportActionBar(tool_bar);
        // setting up the adapter
        viewPagerAdapter = new ViewPageAdapter(getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new home(), "HOME");
        viewPagerAdapter.add(new about_us(), "ABOUT US");
        viewPagerAdapter.add(new courses(),"COURSES");
        viewPagerAdapter.add(new placement(),"PLACEMENT");
        viewPagerAdapter.add(new registration(),"REGISTRATION");
        viewPagerAdapter.add(new contact_us(),"CONTACT US");



        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        //tabLayout.getTabAt(Integer.parseInt("0")).setIcon(R.drawable.ic_baseline_home_24);


    }



    private void setupTabIcons()
    {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected() {
//                onTabSelected(tabLayout.getTabAt(0).getIcon().setColorFilter(R.color.white);
//            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

            }
});

    }

    }