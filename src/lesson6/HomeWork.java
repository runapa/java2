
package lesson6;


import data.Car;

public class HomeWork {
    public static void main(String[] args) {
        Car bmw = new Car(20000, 2009, 1980, "red", "BMW");
        Car bmwx5 = new Car(70000, 2018, 2308, "black", "BMW");
        Car mercedes = new Car(700, 1997, 1236, "blue", "Mercedes");
        Car vaz = new Car(200, 1984, 1200, "white", "vaz");
        Car granta = new Car(2000, 2011, 1365, "white", "vaz");

        Car[] cars = {bmw, bmwx5, mercedes, vaz, granta};

        printExpenciveCar(cars);
        System.out.println();
        printOldestCar(cars);
    }

    public static void printExpenciveCar(Car[] cars) {
        int expIndex = 0;

        for (int i = 1; i < cars.length; i++) {
            Car expenciveCar = cars[expIndex];
            Car current = cars[i];
            if(current.price > expenciveCar.price){
                expIndex = i;
            }
        }
        Car mostExpenciveCar = cars[expIndex];
        System.out.println("Price: " + mostExpenciveCar.price);
        System.out.println("Year: " + mostExpenciveCar.year);
        System.out.println("Weight: " + mostExpenciveCar.weight);
        System.out.println("Color: " + mostExpenciveCar.color);
        System.out.println("Producer: " + mostExpenciveCar.producer);
    }

    public static void printOldestCar(Car[] cars){
        int expIndex = 0;

        for (int i = cars.length - 1; i >= 0; i--) {
            Car oldestCar = cars[expIndex];
            Car current = cars[i];
            if(current.year < oldestCar.year){
                expIndex = i;
            }
        }
        Car oldestCar = cars[expIndex];
        System.out.println("Price: " + oldestCar.price);
        System.out.println("Year: " + oldestCar.year);
        System.out.println("Weight: " + oldestCar.weight);
        System.out.println("Color: " + oldestCar.color);
        System.out.println("Producer: " + oldestCar.producer);
    }
}