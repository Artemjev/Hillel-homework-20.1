package com.hillel.artemjev.orderpizza.orderhandler;

import com.hillel.artemjev.orderpizza.entities.Order;

public class MessageOrderHandler extends OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("pizza " + order + " accepted successfully");
        next(order);
    }
}