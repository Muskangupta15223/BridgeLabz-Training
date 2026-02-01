package com.functionalinterface.dateformat;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        // dd-MM-yyyy format
        String format1 = DateFormatUtil.formatDate(
                invoiceDate,
                date -> date.format(DateFormatUtil.ddMMyyyy())
        );

        // yyyy-MM-dd format
        String format2 = DateFormatUtil.formatDate(
                invoiceDate,
                date -> date.format(DateFormatUtil.yyyyMMdd())
        );

        // Custom format using lambda
        String format3 = DateFormatUtil.formatDate(
                invoiceDate,
                date -> date.format(
                        java.time.format.DateTimeFormatter.ofPattern("MMM dd, yyyy"))
        );

        System.out.println("Invoice Date Formats:");
        System.out.println("dd-mm-yyyy " + format1);
        System.out.println("yyyy-mm-dd " + format2);
        System.out.println("mm dd ,yyyy " + format3);
    }
}

