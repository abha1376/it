package com.example.abhatripathi.iitline;

import java.io.Serializable;

public class itemVideo implements Serializable {
    public itemVideo(){

    }
    public itemVideo(String videourl) {
        this.videourl = videourl;
    }


    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    String videourl;

}
