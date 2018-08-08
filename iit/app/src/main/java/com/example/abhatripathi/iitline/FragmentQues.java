package com.example.abhatripathi.iitline;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentQues extends Fragment implements AdapterMaths1.ItemClickListener {
    ArrayList<quizDisplay> mMathsArrayList = new ArrayList<>();
    private int mCurrentCorrectAnswer;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_ques, container, false);

        mMathsArrayList.add(
                new quizDisplay("QUESTION 1:", "2+4=?", "ITS basic 6", "6","7","8","4", 1));

        RecyclerView recyclerView = v.findViewById(R.id.rvMaths);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        AdapterMaths1 adapterMaths1 = new AdapterMaths1(mMathsArrayList,getContext());
        adapterMaths1.setClickListener(this);


        recyclerView.setAdapter(adapterMaths1);

        return v;
    }



//    @Override
//    public void onOption1Click(View view1, View view2, View view3, View view4, int position) {
//        RadioButton button = (RadioButton) view1;
//       ((RadioButton) view1).setTextColor(Color.RED);
//       ((RadioButton) view2).setTextColor(Color.RED);
//       ((RadioButton) view3).setTextColor(Color.RED);
//       ((RadioButton) view4).setTextColor(Color.RED);
//        mCurrentCorrectAnswer = mMathsArrayList.get(position).answer;
//
//        if (mCurrentCorrectAnswer == 1){
//            button.setTextColor(Color.GREEN);
//        }
//        else {
//            button.setTextColor(Color.RED);
//        }
//    }


    @Override
    public void onOptionClick(View view1, View view2, View view3, View view4, int position) {
        mCurrentCorrectAnswer = mMathsArrayList.get(position).answer;
        if (mCurrentCorrectAnswer == 1){
            ((RadioButton) view1).setTextColor(Color.GREEN);
            ((RadioButton) view2).setTextColor(Color.RED);
            ((RadioButton) view3).setTextColor(Color.RED);
            ((RadioButton) view4).setTextColor(Color.RED);
        }else if (mCurrentCorrectAnswer == 2){
            ((RadioButton) view1).setTextColor(Color.RED);
            ((RadioButton) view2).setTextColor(Color.GREEN);
            ((RadioButton) view3).setTextColor(Color.RED);
            ((RadioButton) view4).setTextColor(Color.RED);
        }else if (mCurrentCorrectAnswer == 3){
            ((RadioButton) view1).setTextColor(Color.RED);
            ((RadioButton) view2).setTextColor(Color.RED);
            ((RadioButton) view3).setTextColor(Color.GREEN);
            ((RadioButton) view4).setTextColor(Color.RED);
        }else {
            ((RadioButton) view1).setTextColor(Color.RED);
            ((RadioButton) view2).setTextColor(Color.RED);
            ((RadioButton) view3).setTextColor(Color.RED);
            ((RadioButton) view4).setTextColor(Color.GREEN);
        }
    }

    @Override
    public void onSubmitClick(View view, int position) {

    }
}

