package com.functionalinterface.dateformat;

import java.time.LocalDate;

@FunctionalInterface
public interface DateFormatter {

    String format(LocalDate date);
    
}