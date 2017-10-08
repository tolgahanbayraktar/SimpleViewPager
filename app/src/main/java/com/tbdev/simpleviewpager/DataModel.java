package com.tbdev.simpleviewpager;


import java.util.ArrayList;
import java.util.List;

public class DataModel {

    String baslik;
    int imageId;

    public DataModel(int imageId, String title) {
        //this.imageId = imageId;
        //this.baslik = title;

        setImageId(imageId);
        setBaslik(title);
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    public static List<DataModel> getDataList() {
        List<DataModel> itemList = new ArrayList<>();

        int[] imageIds = new int[]{
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6
        };

        String[] basliklar = new String[]{
                "Resim 1", "Resim 2", "Resim 3", "Resim 4", "Resim 5", "Resim 6"
        };

        for (int i = 0; i < imageIds.length; i++) {
            itemList.add(new DataModel(imageIds[i], basliklar[i]));
        }

        return itemList;
    }
}
