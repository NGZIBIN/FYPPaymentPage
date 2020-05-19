package com.example.fypcardslider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransHistroyFragment extends Fragment {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    public TransHistroyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trans_histroy, container, false);

        listView = listView.findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Chicken rice");
        listDataHeader.add("Thai Fried rice");

        List<String> editDev = new ArrayList<>();
        editDev.add("$20");

        List<String>androidStudio = new ArrayList<>();
        androidStudio.add("Testing");

        listHash.put(listDataHeader.get(0),editDev);
        listHash.put(listDataHeader.get(1),androidStudio);
    }
}
