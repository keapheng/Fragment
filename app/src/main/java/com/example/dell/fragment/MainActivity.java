package com.example.dell.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("App");
        setSupportActionBar(toolbar);

        TabLayout tab = findViewById(R.id.tab);
        ViewPager viewPager = findViewById(R.id.viewpager);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);


    }
    public static class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages.
        @Override
        public int getCount() {
            return 8;
        }

        // Returns the fragment to display for a particular page.
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentWithOneImage.newInstance("Fragment 1", R.drawable.lightbulb);
                case 1:
                    return FragmentWithOneImage.newInstance("Fragment 2", R.drawable.lightbulb);
                case 2:
                    return FragmentWithOneImage.newInstance("Fragment 3", R.drawable.lightbulb);
                case 3:
                    return FragmentWithOneImage.newInstance("Fragment 4", R.drawable.lightbulb);
                case 4:
                    return FragmentWithOneImage.newInstance("Fragment 5", R.drawable.lightbulb);
                case 5:
                    return FragmentWithOneImage.newInstance("Fragment 6", R.drawable.lightbulb);
                case 6:
                    return FragmentWithOneImage.newInstance("Fragment 7", R.drawable.lightbulb);
                case 7:
                    return FragmentWithOneImage.newInstance("Fragment 8", R.drawable.lightbulb);
                case 8:
                    return FragmentWithOneImage.newInstance("Fragment 9", R.drawable.lightbulb);

                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + position;
        }

    }
}

