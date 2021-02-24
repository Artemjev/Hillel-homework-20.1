package com.hillel.artemjev.orderpizza.orderhandler;

import com.hillel.artemjev.orderpizza.entities.Order;
import com.hillel.artemjev.orderpizza.exception.InvalidOderDataException;

public class ValidateOrderHandler extends OrderHandler {
    @Override
    public void handle(Order order) {
        if (order.getId() == null || order.getFrom() == null) {
            throw new InvalidOderDataException("Order data is not valid: " + order);
        }
        System.out.println("Order data is valid: " + order);
        next(order);
    }
}
