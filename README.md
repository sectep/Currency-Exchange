# Currency-Exchange

## Overview

This project is a simple currency converter that allows users to convert various currencies into USD. The application supports multiple currencies and provides a straightforward interface for conversion.

## Features

- Convert currencies: EUR, UAH, CHF, and more.
- Easily extendable: Add new currencies and modify exchange rates.

## Getting Started

To run this project, follow these steps:

1. **Clone the repository** to your local machine:
   ```bash
   git clone https://github.com/sectep/Currency-Exchange.git
   ```
   
2. **Navigate** to the project directory:
   ```bash
   cd currency-exchange
   ```
   
3.**Ensure the project is placed in a folder named** *currencyExchange*. The folder structure should look like this:
   ```bash
    currencyExchange/
    ├── Currency.java
    ├── Console.java
    ├── Exchanger.java
    └── Main.java
  ```
4. **compile and run the project** using your preferred Java IDE or command line.

## Modifying the Currency Enum

You can easily add new currencies to the project by modifying the `Currency` enum. To do this:

1. Open the `Currency.java` file.
2. Add your new currency code (e.g., `GBP` for British Pound) to the enum list.
3. Update the `exchangeToUSD` method in the `Exchanger.java` file to include the new currency and its exchange rate using a `switch` statement.

### Example

To add a new currency (e.g., GBP):

1. In `Currency.java`:
   ```java
   enum Currency {
       EUR, UAH, CHF, GBP // Add your new currency here
   }
   ```

2. In *Exchanger.java*, update the *exchangeToUSD* method:
```java
double exchangeToUSD(Currency IFO, int money) {
    double total = 0; // Initialize total

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
        case GBP: // Add your new currency case here
            total = money * 1.39; // Example exchange rate
            break;
        default:
            System.out.println("There is no such IFO in our base.");
            return -1; // Return -1 to indicate an error
    }

    return total; // Return the result
}
```

##Contributing
Feel free to fork the repository and submit pull requests for any improvements or new features!
   
