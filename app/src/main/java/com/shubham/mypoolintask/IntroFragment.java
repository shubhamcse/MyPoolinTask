package com.shubham.mypoolintask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Shubham Gupta on 11-09-2016.
 */
public class IntroFragment extends Fragment {
    ImageView imageView;
    int image;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          View view = inflater.inflate(R.layout.fragment, container, false);
          imageView = (ImageView)view.findViewById(R.id.imageView);
          return  view;
    }

    public void setImageView(int image) {
      this.image = image;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.imageView.setImageResource(image);
    }
}
