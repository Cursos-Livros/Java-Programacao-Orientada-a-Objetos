package aula4excessoespersonalizadas.solucao1ruim.model.application;

import aula4excessoespersonalizadas.solucao1ruim.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Room number: ");
        int roomNumber = scanner.nextInt();

        System.out.println("Enter checkin date:");
        scanner.nextLine();
        LocalDate checkin = LocalDate.parse(scanner.nextLine(), dateFormatter);

        System.out.println("Enter checkout date:");
        LocalDate checkout = LocalDate.parse(scanner.nextLine(), dateFormatter);

        if (checkin.isAfter(checkout)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.println("Enter checkin date:");
            checkin = LocalDate.parse(scanner.nextLine(), dateFormatter);
            System.out.println("Enter checkout date:");
            checkout = LocalDate.parse(scanner.nextLine(), dateFormatter);

            LocalDate now = LocalDate.now();
            if (checkin.isBefore(now) || checkout.isBefore(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (checkin.isAfter(checkout)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDates(checkin, checkout);
                System.out.println(reservation);

            }
        }

        scanner.close();
    }
}
