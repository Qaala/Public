package com.examination.exam.models;

import com.examination.exam.interfaces.Fruit;

public class Mandalina implements Fruit {

    @Override
    public String getType() {
        return "Mandalina meyvesi üretilmiştir.";
    }
}
