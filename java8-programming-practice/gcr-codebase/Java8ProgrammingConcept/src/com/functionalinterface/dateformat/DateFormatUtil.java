package com.functionalinterface.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtil {

    static String formatDate(LocalDate date, DateFormatter formatter) {
        return formatter.format(date);
    }

    static DateTimeFormatter ddMMyyyy() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    static DateTimeFormatter yyyyMMdd() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }
}

