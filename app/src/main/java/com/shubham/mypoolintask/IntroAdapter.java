package com.shubham.mypoolintask;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Shubham Gupta on 10-09-2016.
 */
public class IntroAdapter extends FragmentPagerAdapter {

    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                IntroFragment intro = new IntroFragment();
                intro.setImageView(R.drawable.black);
                return intro;
            default:
                IntroFragment intro1 = new IntroFragment();
                intro1.setImageView(R.drawable.screenshot);
                return intro1;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

}