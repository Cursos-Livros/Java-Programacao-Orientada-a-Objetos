package exercicio.entities;

import aula1enumeracao.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    public Order() {
    }

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }


    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        LocalDateTime now = LocalDateTime.now();

        stringBuilder.append("Order Summary:\n");
        stringBuilder.append("Order moment: ").append(now.toString()).append("\n");
        // Adicione formatação adequada para o status
        stringBuilder.append("Order status: ").append(status).append("\n");
        stringBuilder.append("Client: ").append(client.getName()).append(" ").append(client.getBirthDay()).append(" - ").append(client.getEmail()).append("\n");

        for (OrderItem orderItem : items) {
            stringBuilder.append(orderItem).append("\n");
        }

        stringBuilder.append("Total: $").append(total());

        return stringBuilder.toString();
    }
}
