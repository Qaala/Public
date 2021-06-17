package com.examination.exam.models;

import com.examination.exam.interfaces.Fruit;

public class Armut implements Fruit {
    @Override
    public String getType() {
        return "Armut meyvesi üretilmiştir.";
    }
}
