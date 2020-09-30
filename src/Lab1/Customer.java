package Lab1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Customer extends User {
    private String email;
    private String name;
    private String surname;


    Customer()
    {
        email = " ";
        name = " ";
        surname = " ";
    }

    Customer(String name, String surname, String email)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public void login(String login, int code) {
        return;
    }

    @Override
    public int generateCode(String phone) {
        return 0;
    }

    public void buy(Customer customer) {
       Check check = new Check();
       customer.getCustomer();
       int d = check.calculateDelivery(Check.countFromFile(), Delivery.delivery);
       check.getCheque(Check.countFromFile(), d, "+375444649325");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public void getCustomer()
    {
        System.out.println("Покупатель: " + name + " " + surname + " " + email);
    }
}
