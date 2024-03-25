package org.example;

public enum DaysOfWeek {
    SATURDAY("Saturday"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednsday"),
    THURESDAY("Thuresday"),
    FRIDAY("Friday");

    private String day;

    public String DaysOfWeek() {
        return day;
    }

    DaysOfWeek(String day) {
        this.day = day;
    }
}