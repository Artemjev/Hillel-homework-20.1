package com.hillel.artemjev.orderpizza;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hillel.artemjev.orderpizza.entities.Order;
import com.hillel.artemjev.orderpizza.orderhandler.OrderHandler;
import com.hillel.artemjev.orderpizza.orderhandler.MessageOrderHandler;
import com.hillel.artemjev.orderpizza.orderhandler.SaveOrderHandler;
import com.hillel.artemjev.orderpizza.orderhandler.ValidateOrderHandler;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1);
        order.setFrom("me");
        order.setText("hurry up");

        OrderHandler chain = new ValidateOrderHandler()
                .addNext(new SaveOrderHandler("orderpizza.txt", new ObjectMapper()))
                .addNext(new MessageOrderHandler());

        chain.handle(order);
    }
}
