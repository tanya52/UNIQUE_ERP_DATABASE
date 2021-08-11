package com.example.unique_erp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.*;


public class courses extends Fragment implements AdapterView.OnItemClickListener {
    ListView listview;
    String aa[] = {"SAP TRAINING", "JAVA TRAINING", "WEB DESIGNING", "WEB DEVELOPMENT", "DIGITAL MARKETING", ".NET TRAINING", "PYTHON", "ORACLE TRAINING(SQL/MYSQL)", "ANDROID(MOBILE APPLICATION)", "PHP TRAINING", "LINUX", "NETWORKING", "CLOUD COMPUTING", "C & C++", "A LEVEL", "O LEVEL"};

    public courses() {
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
        View view = inflater.inflate(R.layout.fragment_courses, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        listview = view.findViewById(R.id.listview);
        ArrayAdapter<String> arr = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,aa);
        listview.setAdapter(arr);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            //Toast.makeText(getActivity(),"sappp",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getActivity(),activityy.class);
        }

    }
}


