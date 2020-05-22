package lesson12;

import java.util.Objects;

public class Sphere implements Figur{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSquare() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }

        if(object instanceof Sphere){
            Sphere newObj = (Sphere) object;
            return this.radius == newObj.getRadius();
        }
        return false;
    }


    public String toString(){
        return "Shape with radius " + radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}