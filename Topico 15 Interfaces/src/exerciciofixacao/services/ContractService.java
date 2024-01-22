package exerciciofixacao.services;

import exerciciofixacao.model.entities.Contract;
import exerciciofixacao.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double quota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double interest = onlinePaymentService.interest(quota, i);
            double paymentFee = onlinePaymentService.paymentFee(interest);
            LocalDate date = contract.getDate().plusMonths(i);
            contract.addInstallment(new Installment(date, interest));
        }
    }
}
