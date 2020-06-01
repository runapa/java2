package lesson18;

import data.Auto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.TreeSet;

public class MyProfileProcessor {
    public static Auto executeWithProfiling(String methodName, Collection<Auto> autos) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Auto result = null;
        final Method[] methods = AnnotationTest.class.getMethods();
        for(Method method : methods){
            if(method.getName().equals(methodName)){
                if(method.isAnnotationPresent(MyProfile.class)){
                    long startTime = System.currentTimeMillis();

                    Object resultObject = method.invoke(null, autos);
                    result = (Auto) resultObject;

                    long stopTime = System.currentTimeMillis();
                    long duration = stopTime - startTime;
                    System.out.println(methodName + "execution took: " + duration + " milli seconds");
                }else{
                    Object resultObject = method.invoke(null, autos);
                    result = (Auto) resultObject;
                }
            }
        }
        return result;
    }
}
