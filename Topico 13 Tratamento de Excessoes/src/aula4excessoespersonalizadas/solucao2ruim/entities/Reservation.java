package aula4excessoespersonalizadas.solucao2ruim.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration() {
        Duration calculatedays = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        long days = calculatedays.toDays();
        return days;
    }

    public String updateDates(LocalDate checkin, LocalDate checkout) {
        LocalDate now = LocalDate.now();

        if (checkin.isBefore(now) || checkout.isBefore(now)) {
            return ("Reservation dates for update must be future dates");
        }
        if (checkin.isAfter(checkout)) {
            return ("Check-out date must be after check-in date");
        }

        this.checkin = checkin;
        this.checkout = checkout;

        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        String checkinFormated = (checkin != null) ? checkin.format(formatter) : "null";
        String checkoutFormated = (checkout != null) ? checkout.format(formatter) : "null";

        stringBuilder.append("Room:\n");
        stringBuilder.append(roomNumber).append("\n");
        stringBuilder.append("Checkin:\n");
        stringBuilder.append(checkinFormated).append("\n");
        stringBuilder.append("Checkout:\n");
        stringBuilder.append(checkoutFormated).append(" ").append(", ");
        stringBuilder.append(duration());
        stringBuilder.append(" nights.");

        return stringBuilder.toString();
    }
}
