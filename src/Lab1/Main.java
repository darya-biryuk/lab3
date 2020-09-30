package Lab1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Customer customer = new Customer("Бирюк", "Дарья", "Викторовна");
        Garment.showCatalog();
        System.out.println("Выберете товар в корзину");
        System.out.println("Нажмите '0' для покупки");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            if (choice > 0 && choice <= 4) {
                try {
                    Files.write(Paths.get("src/Lab1/file")
                            , (String.valueOf(Garment.chooseItem(choice - 1)) + "\n").getBytes(),
                            StandardOpenOption.APPEND);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } while (choice != 0);

        System.out.println("К оплате: ");
        customer.buy(customer);
    }
}
