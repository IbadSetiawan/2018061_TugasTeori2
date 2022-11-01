package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Dawet Ayu",
            "Dawet Grandul Ketan",
            "Dawet Ireng",
            "Dawet Putih",
            "Es Cincau",
            "Es Tape",
            "Es Kopyor",
            "Es Cao",
    };

    private static String [] foodPrice = {
            "10.000",
            "20.000",
            "15.000",
            "7.500",
            "25.000",
            "30.000",
            "35.000",
            "2.500"
    };

    private static int [] foodImage = {
            R.drawable.dawet_ayu,
            R.drawable.dawet_grandul_ketan,
            R.drawable.dawet_ireng,
            R.drawable.dawet_putih,
            R.drawable.cincau,
            R.drawable.tape,
            R.drawable.kopyor,
            R.drawable.cao,
    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
