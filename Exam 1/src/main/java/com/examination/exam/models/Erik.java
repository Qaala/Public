package com.examination.exam.models;

import com.examination.exam.interfaces.Fruit;

public class Erik implements Fruit {
    @Override
    public String getType() {
        return "Erik meyvesi üretilmiştir.";
    }
}
