package lesson9;

import data.Auto;
import data.AutoSalon;
import enums.Color;

public class ClassWork {
    public static void main(String[] args) throws Exception{
        Auto bmw = new Auto();
        Auto toyota = new Auto(Color.BLACK, 1350, 5000);
        Auto toyotaX = new Auto(Color.BLACK, 1200, 100_000);
        Auto bmwX5 = new Auto(Color.RED, 2500, 70_000);
        Auto bmwX6 = new Auto(Color.WHITE, 2500, 70_000);

        AutoSalon salon = new AutoSalon(500_000l);

        salon.buyAuto(toyotaX);
        salon.buyAuto(toyota);
        salon.buyAuto(bmwX5);
        salon.buyAuto(bmwX6);

        salon.printreport();

        salon.sellAuto();

        salon.printreport();
        System.out.println();
    }
}
