package lesson9;

import data.Auto;
import data.AutoSalon;
import enums.Color;

public class ClassWork {
    public static void main(String[] args) {
        Auto bmw = new Auto();
        Auto toyota = new Auto(Color.BLACK, 1350, 5000);
        Auto toyotaX = new Auto(Color.BLACK, 1200, 100_000);

        AutoSalon salon = new AutoSalon(500_000l);
    }
}
