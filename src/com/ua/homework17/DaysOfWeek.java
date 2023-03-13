package com.ua.homework17;

public enum DaysOfWeek {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private final int dayOfWeek;

    DaysOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    DaysOfWeek getDayOfWeek() {
       DaysOfWeek day = null;
        switch (dayOfWeek) {
            case 1:
                day = MONDAY;
                break;
            case 2:
                day = TUESDAY;
                break;
            case 3:
                day = WEDNESDAY;
                break;
            case 4:
                day = THURSDAY;
                break;
            case 5:
                day = FRIDAY;
                break;
            case 6:
                day = SATURDAY;
                break;
            case 7:
                day = SUNDAY;
                break;
        }
        return day;
    }

    public static void main(String[] args) {
        for (DaysOfWeek day: DaysOfWeek.values()) {
            System.out.print(day.dayOfWeek);
            System.out.print("  ");
            System.out.println(day.getDayOfWeek());
        }
    }

}
