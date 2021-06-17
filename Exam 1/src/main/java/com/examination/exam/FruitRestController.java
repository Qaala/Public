package com.examination.exam;

import com.examination.exam.interfaces.Fruit;
import com.examination.exam.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitRestController {

    @GetMapping("/{fruitName}")
    public String getFruit(@PathVariable String fruitName) {
        fruitName = fruitName.toLowerCase();
        Fruit fruit;
        switch (fruitName){
            case "cilek": fruit = new Cilek(); break;
            case "armut": fruit = new Armut(); break;
            case "erik": fruit = new Erik(); break;
            case "kiraz": fruit = new Kiraz(); break;
            case "mandalina": fruit = new Mandalina(); break;
            default:
                return "Böyle bir yol bulunamadı. /cilek, /armut, /erik, /kiraz, /mandalina deneyin.";
        }
        return fruit.getType();
    }
}
