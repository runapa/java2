package lesson17;

import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final AutoPriceComparator priceComparator = new AutoPriceComparator();
        TreeSet<Auto> treeSetByPrice = new TreeSet<>(priceComparator);
        treeSetByPrice.add(new Auto());
        treeSetByPrice.add(new Auto());
        treeSetByPrice.add(new Auto());
        System.out.println(treeSetByPrice);


        Auto auto = new Auto();
        Method autoMethod = auto.getClass().getDeclaredMethod("getAutoWithMaxPrice", TreeSet.class);
        autoMethod.setAccessible(true);
        Object result = autoMethod.invoke(auto, treeSetByPrice);
        System.out.println(result);

        System.out.println("===========================================================");

        Set<Auto> autoSet = new HashSet<>();
        autoSet.add(new Auto());
        autoSet.add(new Auto());
        autoSet.add(new Auto());

        Auto maxPriceAuto = getMaxPriceAuto(autoSet);
        System.out.println(maxPriceAuto);
        System.out.println(autoSet);
    }

    public static Auto getMaxPriceAuto(Set<Auto> autos) {
        Auto result = null;
/*        final Iterator<Auto> iterator = autos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        if (autos != null && autos.iterator().hasNext()) {
            for (Auto current : autos) {
                if (current.getPrice() > result.getPrice()) {
                    result = current;
                }
            }
        }
        return result;
    }
}
