package currencyExchange;

public class Exchanger {
    static double total;
    static Currency IFO;

    // exchange to usd
    static double exchangeToUSD(String currency, int money) {
        // check, if the currency matches in out data base.
        try {
            IFO = Currency.valueOf(currency);
        } catch (IllegalArgumentException exc) {
            return total = -1;
        }

        switch (IFO) {
            case EUR:
                total = money * 1.13;
                break;
            case UAH:
                total = money * 0.024;
                break;
            case CHF:
                total = money * 1.21;
                break;
        }

        return total;
    }
}
