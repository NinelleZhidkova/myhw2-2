
public class Main {
    public static void main(String[] args) {
        int x = 100; // стартовая сумма на счёте
        int y = 1200; // сумма пополнения счёта

        if (y < 1000) {

            System.out.println("Бонусов нет");
            System.out.println((x + y) + " рублей на счету ");
        } else {
            System.out.println((y / 100) + " бонусов на счету");
            System.out.println((x + y) + " рублей на счету ");
        }
    }
}