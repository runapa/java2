package lesson18;

import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class AnnotationTest {
    @MyProfile
    public static Auto getMaxPriceAutoFromHashSet(HashSet<Auto> autos) {
        Auto result = null;
        if (autos != null && autos.iterator().hasNext()) {
            result = autos.iterator().next();
            for (Auto current : autos) {
                if (current.getPrice() > result.getPrice()) {
                    result = current;
                }
            }
        }
        return result;
    }

    @MyProfile
    public static Auto getMaxPriceAutoFromSetByReflection(Object autos) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Method getPriceMethod = Auto.class.getMethod("getPrice");
        Object result = null;
        Iterable iterable = (Iterable) autos;
        result = iterable.iterator().next();

        final Iterator iterator = iterable.iterator();

        while (iterator.hasNext()){
            Object currentObject = iterator.next();
            int currentPrice = (int) getPriceMethod.invoke(currentObject);
            int resultPrice = (int) getPriceMethod.invoke(result);
            if(currentPrice > resultPrice){
                result = currentObject;
            }
        }
        return (Auto) result;
    }

    @MyProfile
    public static Auto getMaxPriceAutoFromTreeSet(TreeSet<Auto> autos) {
        return autos.last();
    }

    public static Collection<Auto> generateCollectionByCount(int count) {
        Collection<Auto> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            result.add(new Auto());
        }
        return result;
    }
}
