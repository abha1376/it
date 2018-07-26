package com.example.abhatripathi.iitline;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentQues extends Fragment {
    ArrayList<quizDisplay> MathsArrayList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_ques, container, false);

        MathsArrayList.add(
                new quizDisplay("QUESTION 1:", "2+4=?", "ITS basic 6", "6","7","8","4"));

        RecyclerView recyclerView = v.findViewById(R.id.rvMaths);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        AdapterMaths1 AdapterMaths1 = new AdapterMaths1(MathsArrayList,getContext());


        recyclerView.setAdapter(AdapterMaths1);

        return v;
    }
}

