package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Check implements Delivery, Purchase {
    public static int countFromFile() {
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("src/Lab1/file")))
        {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
        int summa = 0;
        if (array != null)
        {

            for (int i = 0; i < array.length; i++)
            {
                summa +=array[i];
            }

        }
        return summa;
    }

    @Override
    public int calculateDelivery(int amount, int delivery) {
        if (amount < amountWithPayDelivery) {
            return delivery;
        }
        if (amount > amountWithPayDelivery && amount < amountWithFreeDelivery) {
            return delivery / 2;
        }
        return 0;
    }

    @Override
    public int generateCode(String phone) {
        int code = (100 + (int) Math.random() * 999);
        return code;
    }


    @Override
    public void getCheque(int sum, int delivery, String phone) {
        System.out.println("Покупка №" +generateCode(phone));
        System.out.println("Сумма товара: " +sum);
        System.out.println("Цена доставки: " + delivery);
        System.out.println("Итого: " +(delivery + sum));
    }
}
