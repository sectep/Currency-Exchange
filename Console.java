package currencyExchange;

import java.util.Scanner;

public class Console {
    String IFO;
    String totalSTR;
    int total;
    double totalConverted;

    Scanner reader = new Scanner(System.in);

    // a method, which reads the currency.
    void readCurrency() {

        // read the value if currecy base matches..
        while (totalConverted != -1) {
            // read the currency.
            System.out.print("Wrtie a currency, and I will convert to USD: ");
            IFO = reader.nextLine();

            System.out.print("Write the value: ");
            totalSTR = reader.nextLine();

            // convert to USD.
            try {

                total = Integer.parseInt(totalSTR);
                totalConverted = Exchanger.exchangeToUSD(IFO, total);

                // show the result if currency matches.
                if (totalConverted != -1) {
                    System.out.println(total + " of " + IFO +
                            " in USD is $" + totalConverted);
                    break;
                } else {
                    System.out.println("Please write on next session the currency" +
                            "which matches in the given base");
                }

            } catch (NumberFormatException exc) {
                System.out.println("Please write");
            }
        }
    }

}
