package com.examination.exam.models;

import com.examination.exam.interfaces.Fruit;

public class Cilek implements Fruit {
    @Override
    public String getType() {
        return "Cilek meyvesi üretilmiştir.";
    }
}
