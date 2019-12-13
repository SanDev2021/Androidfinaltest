package com.example.sandeep_c0766628_ft;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.zip.Inflater;


public class List_fragment extends Fragment {
    ListView usenameslist;
    ArrayAdapter<String> adapter;
    String testdata[]={"love","me","like"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_fragment,container,false);
        usenameslist=(ListView)view.findViewById(R.id.listview);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,testdata);
        usenameslist.setAdapter(adapter);

        return view;

    }}

