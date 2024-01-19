package aula1interface.application;

import aula1interface.model.entities.CarRental;
import aula1interface.model.entities.Vehicle;
import aula1interface.model.services.BrazilTaxServices;
import aula1interface.model.services.RentalServices;
import aula2solucaocominterface.model.services.TaxService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro:");
        String carModel = scanner.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime pickupDay = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.println("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime returnDay = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        Vehicle car = new Vehicle();
        CarRental carRental = new CarRental(pickupDay, returnDay, car);

        System.out.println("Entre com o preço por hora:");
        Double pricePerHour = scanner.nextDouble();

        System.out.println("Entre com o preço por dia:");
        Double pricePerDay = scanner.nextDouble();

        BrazilTaxServices brazilTaxServices = new BrazilTaxServices();

        RentalServices rentalServices = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());

        rentalServices.processInvoice(carRental);

        System.out.println("Fatura:");
        System.out.println("Pagamento basico:" + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Imposto:" + String.format("%.2f",carRental.getInvoice().getTax()));
        System.out.println("Pagamento total:" + String.format("%.2f",carRental.getInvoice().getTotalPayment()));

        scanner.close();
    }
}