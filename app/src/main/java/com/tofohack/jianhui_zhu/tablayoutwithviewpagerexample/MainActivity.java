package com.tofohack.jianhui_zhu.tablayoutwithviewpagerexample;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.sliding_tabs)
    TabLayout tabLayout;
    @Bind(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /**
         * add tabs, set titles
         */
        tabLayout.addTab(tabLayout.newTab().setText("First"));
        tabLayout.addTab(tabLayout.newTab().setText("Second"));
        tabLayout.addTab(tabLayout.newTab().setText("Third"));
        viewPager.setAdapter(new PageFragmentAdapter(getSupportFragmentManager(), MainActivity.this));

        /**
         * Seems bugs in this function, please check:
         * https://code.google.com/p/android/issues/detail?id=180462
         * http://stackoverflow.com/questions/31641979/using-tablayout-inside-a-fragment-tab-text-invisible
         */
        // tabLayout.setupWithViewPager(viewPager);
        /**
         * Instead, by setting these two listeners, it works fine for me.
         * 1. Set on tab selected listener(when a tab is clicked)
         *
         * 2. Set on Page change listener(when swipe)
         */
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }


}
