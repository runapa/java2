package lesson17;

import data.Auto;

import java.util.Comparator;

public class AutoPriceComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
