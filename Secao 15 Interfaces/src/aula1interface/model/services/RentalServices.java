package aula1interface.model.services;

import aula1interface.model.entities.CarRental;
import aula1interface.model.entities.Invoice;
import aula2solucaocominterface.model.services.TaxService;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentalServices {
    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxServices;

    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental) {
        LocalDateTime t1 = carRental.getStart();
        LocalDateTime t2 = carRental.getFinish();

        long hours = ChronoUnit.HOURS.between(t1, t2);

        double basicPayment;

        if(hours > 12){
            basicPayment = Math.ceil(hours) * pricePerHour;
        }else{
            basicPayment = Math.ceil((double) hours /24) * pricePerDay;
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
