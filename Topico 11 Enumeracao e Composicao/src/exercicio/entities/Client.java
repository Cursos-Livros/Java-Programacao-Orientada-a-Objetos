package exercicio.entities;

import java.time.LocalDateTime;

public class Client {
    private String name;
    private String email;
    private LocalDateTime birthDay;

    public Client() {
    }

    public Client(String name, String email, LocalDateTime birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    @Override // teste
    public String toString() {
        return "Client: " + getName() + " " + getBirthDay() + " - " + getEmail();
    }
}
