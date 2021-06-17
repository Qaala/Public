package com.examination.exam.models;

import com.examination.exam.interfaces.Fruit;

public class Kiraz implements Fruit {
    @Override
    public String getType() {
        return "Kiraz meyvesi üretilmiştir.";
    }
}
