package com.methodreference.invoiceobjectcreation;

public class Invoice {

    int transactionId;
    String date;

    public Invoice(Transaction transaction) {
        this.transactionId = transaction.id;
        this.date = transaction.transactionDate;
    }

    @Override
    public String toString() {
        return "Invoice [transactionId=" + transactionId + ", date=" + date + "]";
    }
}
