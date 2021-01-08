public class Main {
    public static void main(String[] args) {

        int payment = 2000;
        int balance = 500;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
            balance = balance + payment + bonus;
        }
        else {
            balance = balance + payment;
        }
        System.out.println(balance);
    }
}
