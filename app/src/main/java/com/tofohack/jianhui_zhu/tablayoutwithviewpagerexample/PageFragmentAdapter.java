package com.tofohack.jianhui_zhu.tablayoutwithviewpagerexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jianhuizhu on 15-09-05.
 */
public class PageFragmentAdapter extends FragmentPagerAdapter {
    private final int numOfPage = 3;
    private Context context;

    public PageFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(context, position);
    }

    @Override
    public int getCount() {
        return numOfPage;
    }
}
