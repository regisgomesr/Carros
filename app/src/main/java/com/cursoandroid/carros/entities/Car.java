package com.cursoandroid.carros.entities;

import android.graphics.drawable.Drawable;

public class Car {

    public int id;
    public String model;
    public String manufacture;
    public int horsePower;
    public Double price;
    public Drawable pictures;

    public Car(int id, String model, String manufacture, int horsePower, Double price, Drawable pictures) {
        this.id = id;
        this.model = model;
        this.manufacture = manufacture;
        this.horsePower = horsePower;
        this.price = price;
        this.pictures = pictures;
    }
}
