public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        System.out.println(expected == actual);
    }
}