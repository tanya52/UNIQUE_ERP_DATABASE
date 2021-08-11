package com.example.unique_erp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {


    public home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        ImageSlider imageSlider = view.findViewById(R.id.image_slider);

        List<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.one, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.two, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.three, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.four, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.five, ScaleTypes.FIT));

        imageSlider.setImageList(imageList,ScaleTypes.FIT);

        return view;
    }
}