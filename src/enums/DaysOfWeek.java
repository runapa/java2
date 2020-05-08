package enums;

public enum DaysOfWeek {
    SUNDAY(false),
    MONDAY(true);

    DaysOfWeek(boolean isWorkingDay){
        this.isWorkingDay = isWorkingDay;
    }

    boolean isWorkingDay;
}
