package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

    private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public String marshal(LocalDate dateTime) {
        return dateTime.format(dateFormat);
    }

    @Override
    public LocalDate unmarshal(String dateTime) {
        return LocalDate.parse(dateTime, dateFormat);
    }
}

