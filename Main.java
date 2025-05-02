package currencyExchange;

public class Main {
    static double totatMoney;

    public static void main(String[] args) {
        Console console = new Console();

        // get the currency, which user can convert.
        System.out.print("You can convert from ");
        for (Currency currency : Currency.values()) {
            System.out.print(currency + " ");
        }

        System.out.println();
        console.readCurrency();

    }
}
