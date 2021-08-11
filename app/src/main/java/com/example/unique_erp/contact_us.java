package com.example.unique_erp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class contact_us extends Fragment {

   TextView tv9;

    public contact_us() {
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
        View view= inflater.inflate(R.layout.fragment_contact_us, container, false);
      tv9=view.findViewById(R.id.tv9);

      tv9.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              gotoUrl("https://www.uniqueerp.co.in/");
          }

          private void gotoUrl(String s) {
              Uri uri = Uri.parse(s);
              startActivity(new Intent(Intent.ACTION_VIEW, uri));
          }
      });
       return view;
    }
}