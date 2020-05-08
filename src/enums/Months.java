package enums;

public enum Months {
    JANUARY("winter"),
    FEBRUARY("winter"),
    MARCH("spring"),
    APRIL("spring"),
    MAY("spring"),
    JUNE("summer"),
    JULY("summer"),
    AUGUST("summer"),
    SEPTEMBER("fall"),
    OCTOBER("fall"),
    NOVEMBER("fall"),
    DECEMBER("winter");

    Months(String season) {
        this.season = season;
    }

    public String season;

}
