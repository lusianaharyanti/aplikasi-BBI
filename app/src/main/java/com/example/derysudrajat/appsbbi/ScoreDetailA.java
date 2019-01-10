package com.example.derysudrajat.appsbbi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ScoreDetailA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_fragment,container, false);
        final ArrayList<Rwayat> rwayats = new ArrayList<>();
        rwayats.add(new Rwayat("22 Januari 2018", "0", "0", "Hard", 30));
        rwayats.add(new Rwayat("22 Januari 2018", "0", "0", "Hard", 30));
        rwayats.add(new Rwayat("22 Januari 2018", "0", "0", "Hard", 30));
        RiwayatAdapter riwayatAdapter =  new RiwayatAdapter(this.getActivity(), rwayats);
        ListView rv= rootView.findViewById(R.id.mainRV);
        rv.setAdapter((ListAdapter) riwayatAdapter);
        return rootView;
    }
}
