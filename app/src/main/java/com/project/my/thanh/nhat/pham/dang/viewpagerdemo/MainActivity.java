package com.project.my.thanh.nhat.pham.dang.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        tabLayout = (TabLayout) findViewById(R.id.TabLayout_MainActivity);

        tabLayout.addTab(tabLayout.newTab().setText("Luffy"));
        tabLayout.addTab(tabLayout.newTab().setText("Zoro"));
        tabLayout.addTab(tabLayout.newTab().setText("Nami"));
        tabLayout.addTab(tabLayout.newTab().setText("Sanji"));
        tabLayout.addTab(tabLayout.newTab().setText("Ushop"));
        tabLayout.addTab(tabLayout.newTab().setText("Chopper"));
        tabLayout.addTab(tabLayout.newTab().setText("Robin"));
        tabLayout.addTab(tabLayout.newTab().setText("Franky"));
        tabLayout.addTab(tabLayout.newTab().setText("Brook"));
        tabLayout.addTab(tabLayout.newTab().setText("Franky"));
        tabLayout.setTabGravity(TabLayout.MODE_SCROLLABLE);

        viewPager = (ViewPager) findViewById(R.id.viewPager_MainActivity);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
    }

    public class MyAdapter extends FragmentStatePagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Picture_Fragment picture_fragment = new Picture_Fragment();
            Bundle bundle = new Bundle();

            switch(position){
                case 0:
                    bundle.putInt("hinh", R.drawable.luffy);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 1:
                    bundle.putInt("hinh", R.drawable.zoro);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 2:
                    bundle.putInt("hinh", R.drawable.nami);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 3:
                    bundle.putInt("hinh", R.drawable.usop);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 4:
                    bundle.putInt("hinh", R.drawable.sanji);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 5:
                    bundle.putInt("hinh", R.drawable.chopper);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 6:
                    bundle.putInt("hinh", R.drawable.robin);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 7:
                    bundle.putInt("hinh", R.drawable.franky);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 8:
                    bundle.putInt("hinh", R.drawable.brook);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
                case 9:
                    bundle.putInt("hinh", R.drawable.jinbei);
                    picture_fragment.setArguments(bundle);
                    return picture_fragment;
            }

            return null;
        }

        @Override
        public int getCount() {
            return 10;
        }
    }
}
