package com.streamapi.stockpricelogger;
import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                2450.75,
                2462.10,
                2448.50,
                2475.90
        );

        // forEach + lambda
        stockPrices.forEach(price ->
                System.out.println("Live Stock Price: ₹" + price)
        );
    }
}
