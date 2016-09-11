package com.shubham.mypoolintask;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ViewPager mViewPager;
    ImageView animatedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         animatedView = (ImageView) findViewById(R.id.imageView);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        final int pageWidth=mViewPager.getMeasuredWidth();
       mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

               animatedView.setTranslationX((position+positionOffset)*100);
               animatedView.setTranslationY((position+positionOffset)*100);

           }

           @Override
           public void onPageSelected(int position) {

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new IntroAdapter(getSupportFragmentManager()));


    }
}
