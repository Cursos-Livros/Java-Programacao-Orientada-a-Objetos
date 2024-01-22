package aula1interface.model.services;

import aula3inversaocontroleinjecaodependencia.model.services.TaxService;

public class BrazilTaxServices implements TaxService {
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}
