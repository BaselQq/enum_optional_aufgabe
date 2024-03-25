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

    public String getDayType(String day) {
        if (day.equals(MONDAY) || day.equals(TUESDAY)
                || day.equals(THURESDAY)
                || day.equals(WEDNESDAY)
                || day.equals(FRIDAY)
        ) {
            return day.toString();
        }

        if (!day.equals(this.day)) {
            return "You need to pass a day as String";
        }

        return "Weekend";
    }

    @Override
    public String toString() {
        return "org.example.Main.DaysOfWeek{" +
                "day='" + day + '\'' +
                '}';
    }
}