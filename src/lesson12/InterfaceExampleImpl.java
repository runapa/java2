package lesson12;

import data.InterfaceExample;

public class InterfaceExampleImpl implements InterfaceExample {
    @Override
    public void printFromInterface() {
        System.out.println("Hello From Implementation... :)");

    }

    public void printFromImpl(){
        System.out.println("My custom print!!!");
    }
}
