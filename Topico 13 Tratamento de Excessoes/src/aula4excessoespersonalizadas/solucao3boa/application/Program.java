package aula4excessoespersonalizadas.solucao3boa.application;

import aula4excessoespersonalizadas.solucao3boa.model.entities.Reservation;
import aula4excessoespersonalizadas.solucao3boa.model.exception.DomainException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int roomNumber = scanner.nextInt();

            System.out.println("Enter checkin date:");
            scanner.nextLine();
            LocalDate checkin = LocalDate.parse(scanner.nextLine(), dateFormatter);

            System.out.println("Enter checkout date:");
            LocalDate checkout = LocalDate.parse(scanner.nextLine(), dateFormatter);


            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.println("Enter checkin date:");
            checkin = LocalDate.parse(scanner.nextLine(), dateFormatter);
            System.out.println("Enter checkout date:");
            checkout = LocalDate.parse(scanner.nextLine(), dateFormatter);

            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Date format.");
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Expected Error!");
        }

        scanner.close();
    }
}

