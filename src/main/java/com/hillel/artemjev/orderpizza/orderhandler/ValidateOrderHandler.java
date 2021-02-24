package com.hillel.artemjev.orderpizza.orderhandler;

import com.hillel.artemjev.orderpizza.entities.Order;

public class ValidateOrderHandler extends OrderHandler {
    @Override
    public void handle(Order order) {
        if (order.getId() == null || order.getFrom() == null) {
            System.out.println("Order data is not valid: " + order);
//            throw new InvalidOderDataException("Order data is not valid: " + order);
            return;
        }
        next(order);
    }
}
