package desafio.entities;

import java.util.ArrayList;

public class Department {
    private String name;
    private Integer payDay;

    private Address address;
    private ArrayList<Employee> employee = new ArrayList<>();

    public Department() {
    }

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        this.employee.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employee.remove(employee);
    }

    public Double payRoll() {
        double sumPay = 0.0;
        for (Employee employee : employee) {
            sumPay += employee.getSalary();
        }
        return sumPay;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Folha Pagamento");
        stringBuilder.append("Departamento Vendas = " + "R$ " + payRoll() + "\n");
        stringBuilder.append("Pagamento realizado no dia " + payDay + "\n");

        for (Employee employeesName : employee) {
            stringBuilder.append(employeesName.getName()).append("\n");
        }

        stringBuilder.append("Para dúvidas favor entrar em contato: " + address.getEmail());
        return stringBuilder.toString();
    }
}
