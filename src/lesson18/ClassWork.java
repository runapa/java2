package lesson18;


import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import static lesson18.AnnotationTest.*;
import static lesson18.MyProfileProcessor.executeWithProfiling;

public class ClassWork {
    //Annotation

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Collection<Auto> autoCollection = AnnotationTest.generateCollectionByCount(100);
        TreeSet<Auto> autoTreeSet = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        autoTreeSet.addAll(autoCollection);

        HashSet<Auto> autoHashSet = new HashSet<>();
        autoHashSet.addAll(autoCollection);


        Auto autoMaxPrice1 = executeWithProfiling("getMaxPriceAutoFromHashSet", autoHashSet);
        Auto autoMaxPrice2 = executeWithProfiling("getMaxPriceAutoFromSetByReflection", autoCollection);
        Auto autoMaxPrice3 = executeWithProfiling("getMaxPriceAutoFromTreeSet", autoTreeSet);
    }
}
