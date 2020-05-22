package data;

import java.io.Serializable;

public interface InterfaceExample extends Serializable, Cloneable {
    //public int age; That's not working;
    int AGE = 89; //Переменная в интерфейсе расценивается как константа.

    void printFromInterface();

    default void printZZZ(){
        System.out.println("Print ZZZ"); //Этот метод при желании можно переопределить из наслеников.
    }
}
