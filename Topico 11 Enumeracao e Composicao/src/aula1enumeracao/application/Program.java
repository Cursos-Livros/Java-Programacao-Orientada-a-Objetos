package aula1enumeracao.application;

import aula1enumeracao.entities.Order;
import aula1enumeracao.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus orderStatus1 = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus1);
        System.out.println(orderStatus2);
    }
}