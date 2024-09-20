package org.example;

import org.example.model.Dish;
import org.example.model.Menu;
import org.example.service.OrderService;

public class Main {
    public static void main(String[] args) {
        Dish pizza = new Dish("Pizza", 15.25f);
        Dish burger = new Dish("Burger", 11.55f);
        Dish cola = new Dish("Cola", 6.40f);

        Menu menu = new Menu();
        menu.setMenuList(pizza);
        menu.setMenuList(burger);
        menu.setMenuList(cola);

        OrderService order = new OrderService();

        order.makeOrder(menu);
    }
}