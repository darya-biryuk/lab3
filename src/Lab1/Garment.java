package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Garment implements  Calculator{
    private String mark;
    private int cost;
    private String style;

    static List<Garment> clothes = new ArrayList<>();
    public Garment(String mark, int cost, String style)
    {
        this.mark = mark;
        this.cost = cost;
        this.style = style;
    }

    @Override
    public String toString() {
        return  " " + mark  +
                ", цена: " + cost +
                ", стиль: " + style + ' ';
    }

    public static void showCatalog() {
        clothes.add(new Garment("Платье Mango", 200, "casual"));
        clothes.add(new Garment("Ботинки Marko", 120, "business"));
        clothes.add(new Garment("Туфли МегаТоп", 146, "street"));
        clothes.add(new Garment("Пальто Elema", 566, "casual"));
        for (int i = 0; i < clothes.size(); i++) {
            System.out.println((i + 1) + " " + clothes.get(i));
        }
    }

    public static int chooseItem(int userChoice) {
        return clothes.get(userChoice).getCost();
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int generateCode(String phone) {
        return 0;
    }

    @Override
    public int calculateTotalCost(List<Garment> clothes) {
        int total = 0;
        for (int i = 0; i < clothes.size(); i++)
        {
            total += clothes.get(i).getCost();
        }
        return total;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void setClothes(List<Garment> clothes) {
        Garment.clothes = clothes;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public static List<Garment> getClothes() {
        return clothes;
    }

    public String getMark() {
        return mark;
    }

    public String getStyle() {
        return style;
    }
}
