package org.example.model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> menuList = new ArrayList<>();

    public void setMenuList(Dish dish){
        this.menuList.add(dish);
    }

    public Dish findDish(String dish){
        for(Dish item: menuList){
            if(item.getName().equalsIgnoreCase(dish)){
                return item;
            }
        }
        return null;
    }
    public void displayMenu(){
        for(Dish item: menuList){
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }
}
