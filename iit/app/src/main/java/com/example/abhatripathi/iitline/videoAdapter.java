package com.example.abhatripathi.iitline;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class videoAdapter extends RecyclerView.Adapter<videoAdapter.videoViewHolder>{
List<itemVideo> itemVideoList;
public videoAdapter(){

}

    @NonNull
    @Override
    public videoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video,parent,false);
        return new videoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull videoViewHolder holder, int position) {
        holder.videoWeb.loadData(itemVideoList.get(position).getVideourl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return itemVideoList.size();
    }

    public videoAdapter(List<itemVideo> itemVideoList){
    this.itemVideoList=itemVideoList;
}
public class videoViewHolder extends RecyclerView.ViewHolder{
    WebView videoWeb;
    public videoViewHolder(View itemView){
        super(itemView);
        videoWeb=(WebView)itemView.findViewById(R.id.webvideo);
        videoWeb.getSettings().setJavaScriptEnabled(true);
        videoWeb.setWebChromeClient(new WebChromeClient(){

        });

    }
}
}
