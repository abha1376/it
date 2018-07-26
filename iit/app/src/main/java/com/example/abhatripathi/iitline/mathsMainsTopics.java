package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class mathsMainsTopics extends AppCompatActivity {
    List<itemVideo> youtubevideos=new List<itemVideo>() {
        @Override
        public int size() {
           return youtubevideos.size();
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<itemVideo> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(itemVideo itemVideo) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends itemVideo> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends itemVideo> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public itemVideo get(int i) {
            return null;
        }

        @Override
        public itemVideo set(int i, itemVideo itemVideo) {
            return null;
        }

        @Override
        public void add(int i, itemVideo itemVideo) {

        }

        @Override
        public itemVideo remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<itemVideo> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<itemVideo> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<itemVideo> subList(int i, int i1) {
            return null;
        }
    };
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_topics);


        btn1=findViewById(R.id.mathsMainschapter1);
        btn2=findViewById(R.id.mathsMainschapter2);
        btn3=findViewById(R.id.mathsMainschapter3);
        btn4=findViewById(R.id.mathsMainschapter4);
        btn5=findViewById(R.id.mathsMainschapter5);
        btn6=findViewById(R.id.mathsMainschapter6);
        btn7=findViewById(R.id.mathsMainschapter7);
        btn8=findViewById(R.id.mathsMainschapter8);
        btn9=findViewById(R.id.mathsMainschapter9);
        btn10=findViewById(R.id.mathsMainschapter10);
        btn11=findViewById(R.id.mathsMainschapter11);
        btn12=findViewById(R.id.mathsMainschapter12);
        btn13=findViewById(R.id.mathsMainschapter13);
        btn14=findViewById(R.id.mathsMainschapter14);
        btn15=findViewById(R.id.mathsMainschapter15);
        btn16=findViewById(R.id.mathsMainschapter16);
        btn17=findViewById(R.id.mathsMainschapter17);
        btn18=findViewById(R.id.mathsMainschapter18);
        btn19=findViewById(R.id.mathsMainschapter19);
        btn20=findViewById(R.id.mathsMainschapter20);
        btn21=findViewById(R.id.mathsMainschapter21);
        btn22=findViewById(R.id.mathsMainschapter22);
        btn23=findViewById(R.id.mathsMainschapter23);
        btn24=findViewById(R.id.mathsMainschapter24);
        btn25=findViewById(R.id.mathsMainschapter25);
        btn26=findViewById(R.id.mathsMainschapter26);
        btn27=findViewById(R.id.mathsMainschapter27);
        btn28=findViewById(R.id.mathsMainschapter28);
        btn29=findViewById(R.id.mathsMainschapter29);
        btn30=findViewById(R.id.mathsMainschapter30);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gWRQqAtQzCw?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3xaZtmRcOpc?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mfK7OUe7whs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rR4d5jRVlJg?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/W1vNK7rbrB8?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ay215LJFhFs?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmOVrXQ_QPk?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zznGGAHx_os?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C_W43TZtg5w?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                youtubevideos.add(new itemVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aerE1DMe6iA?list=PLFcidHFGx2VSuPDMuc0mpBj9X5Tv308Eq\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
                FragmentVideo fragobj = new FragmentVideo();
                Bundle bundle=new Bundle();
                bundle.putSerializable("video", (Serializable) youtubevideos);
                fragobj.setArguments(bundle);
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mathsMainsTopics.this,mathsMainsRecycler.class);
                startActivity(i);
            }
        });
    }
}
