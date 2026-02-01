package com.functionalinterface.sensitivedatatagging;

import java.util.Arrays;
import java.util.List;

public class SensitiveDataProcessor {

    public static void main(String[] args) {

        List<Object> dataList = Arrays.asList(
                new CustomerAccount("ACC12345"),
                new Product("Laptop"),
                new CustomerAccount("ACC67890")
        );

        dataList.stream()
                .filter(obj -> obj instanceof SensitiveData)   // marker check
                .map(obj -> (CustomerAccount) obj)
                .map(CustomerAccount::getAccountNumber)
                .map(EncryptionUtils.encrypt)              
                .forEach(System.out::println);
    }
}
