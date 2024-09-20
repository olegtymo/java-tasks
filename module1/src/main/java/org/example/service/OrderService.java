package org.example.service;

import org.example.model.Dish;
import org.example.model.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private String clientConfirmation;
    ArrayList<Dish> clientOrderedList = new ArrayList<>();

    public void makeOrder(Menu menu) {
        Scanner sc = new Scanner(System.in);
        String clientOrder;

        System.out.println("Would you like to make an order? (yer/no)");
        clientConfirmation = sc.nextLine();

        if (clientConfirmation.equalsIgnoreCase("yes")) {
            do {
                System.out.println("Our menu:");
                menu.displayMenu();

                System.out.println("Please enter the name of the dish");
                clientOrder = sc.nextLine();

                Dish orderedDish = menu.findDish(clientOrder);

                if (orderedDish != null) {
                    clientOrderedList.add(orderedDish);
                    System.out.println(orderedDish.getName() + " has been added to your order");
                } else {
                    System.out.println("Unfortunately we do not have this Dish");
                }
                System.out.println("Would you like to add another dish to your order? (yer/no)");
                clientConfirmation = sc.nextLine();
            } while (clientConfirmation.equalsIgnoreCase("yes"));
        }

        displayOrder();
    }

    private void displayOrder() {
        System.out.println("Your Order :");
        float totalCheck = 0f;

        for (Dish orderedDish : clientOrderedList) {
            String orderedDishName = orderedDish.getName();
            Float orderedDishPrice = orderedDish.getPrice();
            totalCheck += orderedDishPrice;
            System.out.println(orderedDishName);
        }
        System.out.println("Total: " + totalCheck);
    }


}
