package com.error41.recyclerview;

public class VaccineModel {

    private  String tittle;
    private  int Image;

    public VaccineModel(String tittle, int image) {
        this.tittle = tittle;
        Image = image;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
