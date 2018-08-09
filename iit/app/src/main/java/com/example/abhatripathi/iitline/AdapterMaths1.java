package com.example.abhatripathi.iitline;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterMaths1 extends RecyclerView.Adapter<AdapterMaths1.MyViewHolder> {
    private ArrayList<quizDisplay> MathsArrayList;
    private Context context;
    private ItemClickListener mClickListener;

    public AdapterMaths1(ArrayList<quizDisplay> quizDisplays, Context ctx) {
        MathsArrayList = quizDisplays;
        context = ctx;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater lif = LayoutInflater.from(context);
        View inflatedView = lif.inflate(R.layout.item_row,parent,false);
        return new MyViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        quizDisplay quizDisplay = MathsArrayList.get(position);

        holder.questionNumber.setText(quizDisplay.getQuestionNumber());
        holder.question.setText(quizDisplay.getQuestion());
        holder.explanation.setText(quizDisplay.getExplanation());
        holder.option1.setText(quizDisplay.getOption1());
        holder.option2.setText(quizDisplay.getOption2());
        holder.option3.setText(quizDisplay.getOption3());
        holder.option4.setText(quizDisplay.getOption4());
        Log.e("TAG", "onBindViewHolder: ");
    }

    @Override
    public int getItemCount() {
        return MathsArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView questionNumber;
        TextView question;
        TextView explanation;
        Button option1;
        Button option2;
        Button option3;
        Button option4;
        RadioGroup radioGroup;

        public MyViewHolder(View itemView) {
            super(itemView);
            questionNumber= itemView.findViewById(R.id.QuestionNumber);
            question = itemView.findViewById(R.id.Question);
            explanation = itemView.findViewById(R.id.explanation);
            option1 = itemView.findViewById(R.id.radioButton1);
            option2 = itemView.findViewById(R.id.radioButton2);
            option3 = itemView.findViewById(R.id.radioButton3);
            option4 = itemView.findViewById(R.id.radioButton4);
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickListener.onOptionClick(option1, option2, option3, option4, getAdapterPosition());
                }
            });
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickListener.onOptionClick(option1, option2, option3, option4, getAdapterPosition());
                }
            });
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickListener.onOptionClick(option1, option2, option3, option4, getAdapterPosition());
                }
            });
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickListener.onOptionClick(option1, option2, option3, option4, getAdapterPosition());
                }
            });

        }

        @Override
        public void onClick(View view) {

        }
    }
    public void setClickListener(AdapterMaths1.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onOptionClick(View view1,View view2,View view3,View view4, int position);
//

        void onSubmitClick(View view, int position);
    }
}

