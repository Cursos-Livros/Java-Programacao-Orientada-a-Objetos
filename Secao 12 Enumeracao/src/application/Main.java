package application;

import entities.Order;
import entities.OrderStatus;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));

        Order order = new Order(1, now, OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
    }
}
