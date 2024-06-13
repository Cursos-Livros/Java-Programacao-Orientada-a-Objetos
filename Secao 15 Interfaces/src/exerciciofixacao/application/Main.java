package exerciciofixacao.application;

import exerciciofixacao.model.entities.Contract;
import exerciciofixacao.model.entities.Installment;
import exerciciofixacao.services.ContractService;
import exerciciofixacao.services.PayPalServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.println("Numero:");
        int numberContract = scanner.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        scanner.nextLine();
        LocalDate date = LocalDate.parse(scanner.nextLine(), dateFormatter);
        System.out.println("Valor do contrato:");
        double contractValue = scanner.nextDouble();

        Contract contract = new Contract(numberContract, date, contractValue);

        System.out.println("Entre com o numero de parcelas:");
        int numberInstallments = scanner.nextInt();

        ContractService contractService = new ContractService(new PayPalServices());

        contractService.processContract(contract, numberInstallments);

        for (Installment contracts : contract.returnInstallment()) {
            System.out.println(contracts.getDueDate() + " - " + contracts.getAmount());
        }

        scanner.close();
    }
}
