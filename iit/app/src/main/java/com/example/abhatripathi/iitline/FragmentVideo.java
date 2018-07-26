package com.example.abhatripathi.iitline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class FragmentVideo extends Fragment {
    RecyclerView recyclerView;
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
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_video,container,false);
        RecyclerView recyclerView = v.findViewById(R.id.rvVideo);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        Bundle bundle = getArguments();
        if(bundle!=null) {
            youtubevideos = (Vector<itemVideo>) bundle.getSerializable("video");
            videoAdapter videoAdapter = new videoAdapter(youtubevideos);
            recyclerView.setAdapter(videoAdapter);

        }

        return v;
    }
}
