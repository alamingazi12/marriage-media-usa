package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HelpActivity extends AppCompatActivity {
    TabLayout tabLayout_contact;
    ViewPager contact_pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        tabLayout_contact=findViewById(R.id.tab_contact);
        contact_pager=findViewById(R.id.contact_pager);
        contact_pager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
        tabLayout_contact.setupWithViewPager(contact_pager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new QFragment();
                    break;
                case 1:
                    fragment = new ContactFragment();
                    break;
            }
            return fragment;
        }
        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "FAQ";

                case 1:
                    return "Contact us";
            }
            return null;
        }
    }
}