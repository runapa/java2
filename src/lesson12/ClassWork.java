package lesson12;

import data.InterfaceExample;

public class ClassWork {
    public static void main(String[] args) {
        InterfaceExample intExample = new InterfaceExampleImpl();
        intExample.printFromInterface();

        Figur figur = new Sphere(10);
        Figur figur1 = new Sphere(1);
        Figur figur2 = new Sphere(0.20);

        Figur figur3 = new Pyramid(20, 20, 20);
        Figur figur4 = new Pyramid(2, 3, 6);
        Figur figur5 = new Pyramid(0.20, 10, 0.1);

        Figur[] array = {figur, figur1, figur2, figur3, figur4, figur5};

        Figur getMaxVolume = getMaxVolumeFigure(array);

        System.out.println(getMaxVolume);

        Figur minFigure = getFigureWithMinSquare(array);

        String format = String.format("The figure with max area is %s. Volume: %f", figur.getClass().getSimpleName(), getMaxVolume.getVolume());
        System.out.println(format);

        String format1 = String.format("The figure with min area is %s. Square: %f", figur.getClass().getSimpleName(), minFigure.getSquare());
        System.out.println(format1);

        System.out.println();

        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(6);
        boolean result = sphere1 == sphere2;

        System.out.println(result);

        Sphere sphere11 = new Sphere(5);
        Sphere sphere21 = new Sphere(5);
        boolean result1 = sphere11 == sphere21;

        System.out.println(result1);
    }

    public static Figur getMaxVolumeFigure(Figur[] array) {
        Figur figurMaxVol = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i].getVolume() > figurMaxVol.getVolume()) {
                figurMaxVol = array[i];
            }
            i++;
        }
        return figurMaxVol;
    }

    public static Figur getFigureWithMinSquare(Figur[] array) {
        Figur figurMinSquare = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i].getSquare() < figurMinSquare.getSquare()) {
                figurMinSquare = array[i];
            }
            i++;
        }
        return figurMinSquare;
    }
}