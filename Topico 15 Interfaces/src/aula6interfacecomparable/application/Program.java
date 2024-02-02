package aula6interfacecomparable.application;

import aula6interfacecomparable.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 15 Interfaces\\src\\aula6interfacecomparable\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeLine = br.readLine();
            while (employeeLine != null) {
                String[] fields = employeeLine.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeLine = br.readLine();
            }
            Collections.sort(list); // Ordena a coleçao
            for (Employee employee : list) {
                System.out.println(employee.getName() + " " + employee.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
