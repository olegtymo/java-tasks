package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dish {
    private String name;
    private Float price;

//    public Dish(String name, Float price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Float getPrice() {
//        return price;
//    }
}
