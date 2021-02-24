package com.hillel.artemjev.orderpizza.orderhandler;

import com.hillel.artemjev.orderpizza.entities.Order;
import lombok.Setter;

@Setter
public abstract class OrderHandler {
    private OrderHandler next;

    public abstract void handle(Order order);

    public OrderHandler addNext(OrderHandler nextHandler) {
        OrderHandler curHandler = this;
        while (curHandler.next != null) {
            curHandler = curHandler.next;
        }
        curHandler.next = nextHandler;
        return this;
    }

    protected void next(Order order) {
        if (next != null)
            next.handle(order);
    }

}
