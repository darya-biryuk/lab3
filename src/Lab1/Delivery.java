package Lab1;

public interface Delivery {
    final int delivery = 20;
    int amountWithPayDelivery = 20;
    int amountWithFreeDelivery = 300;
    int calculateDelivery(int amount, int delivery);
}
