package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exercise004 {

    private final LocalDateTime localDate;

    public Exercise004(LocalDate date) {
        this.localDate=LocalDateTime.of(date, LocalTime.of(0,0));
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDate=dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.localDate.plusSeconds(1000000000);
    }
}
