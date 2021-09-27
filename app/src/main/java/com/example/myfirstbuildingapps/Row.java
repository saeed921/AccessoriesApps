package com.example.myfirstbuildingapps;

public class Row {
    int Image;
    int image1;
    String details;
   // int others;


    public Row(int image, int image1, String details) {
        Image = image;
        this.image1 = image1;
        this.details = details;
        //this.others = others;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

   // public int getOthers() {
       // return others;
   // }

    //public void setOthers(int others) {
       // this.others = others;
    //}
}

