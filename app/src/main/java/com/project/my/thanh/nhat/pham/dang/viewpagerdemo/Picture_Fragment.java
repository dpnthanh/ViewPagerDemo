package com.project.my.thanh.nhat.pham.dang.viewpagerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by nhth1 on 06-Oct-17.
 */

public class Picture_Fragment extends Fragment {

    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_picture, null);

        imageView = (ImageView) view.findViewById(R.id.ImageView_Fragment_Picture);

        if (getArguments() != null){
            imageView.setImageResource(getArguments().getInt("hinh"));
        }

        return view;
    }
}
