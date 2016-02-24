package com.licrafter.happylife.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.licrafter.happylife.R;
import com.licrafter.happylife.base.BaseFragment;
import com.licrafter.happylife.ui.adapter.MainAdapter;

import butterknife.Bind;

/**
 * Created by Administrator on 2016/2/2.
 */
public class MainFragment extends BaseFragment {

    @Bind(R.id.categoryTabLayout)
    TabLayout categoryTabLayout;
    @Bind(R.id.categoryViewPager)
    ViewPager categoryViewPager;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main;
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void initViews(View view) {
        categoryTabLayout.setTabMode(TabLayout.MODE_FIXED);
        categoryTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        categoryTabLayout.setTabTextColors(getResources().getColor(R.color.grey), getResources().getColor(R.color.white));
        ViewCompat.setElevation(categoryTabLayout, getResources().getDimension(R.dimen.appbar_elevation));
        categoryViewPager.setAdapter(new MainAdapter(getChildFragmentManager()));
        categoryTabLayout.setupWithViewPager(categoryViewPager);
    }

    @Override
    public void setListeners() {

    }

    @Override
    public void initData() {

    }
}
