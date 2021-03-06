package data;

import enums.Color;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import static utils.MyUtils.getRandomFromRange;

public class Auto {
    private static final int MIN_WEIGHT = 1_200;
    private static final int MAX_WEIGHT = 2_500;
    private static final int MIN_PRICE = 5_000;
    private static final int MAX_PRICE = 100_000;
    private Color color;
    private  int weight;
    private  int price;


    public Auto() {
        this.color = getRandomColors();
        this.weight = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
        this.price = getRandomFromRange(MIN_PRICE, MAX_PRICE);
    }

    public Auto(Color color, int weight, int price) {
        checkPrice(price);
        checkWeight(weight);

        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    private Color getRandomColors(){
        final Color[] colors = Color.values();

        int randomIndex = getRandomFromRange(0, colors.length -1);
        return colors[randomIndex];
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, price);
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public void setPrice(int price) {
        checkPrice(price);
        this.price = price;
    }

    private void checkPrice(int price){
        if(price < MIN_PRICE || price > MAX_PRICE){
            throw new IllegalArgumentException("Invalid price!");
        }
    }

    private void checkWeight(int weight){
        if(weight < MIN_WEIGHT || weight > MAX_WEIGHT){
            throw new IllegalArgumentException("Invalid weight!");
        }
    }

    private Auto getAutoWithMaxPrice(TreeSet<Auto> autos){
        return autos.last();
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Auto)){
            return false;
        }

        Auto newObj = (Auto) object;

        if(newObj.getColor() != color){
            return false;
        }
        if(newObj.getPrice() != price){
            return false;
        }
        if(newObj.getWeight() != weight){
            return false;
        }
        return true;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "Color: " + color + ", Weight: " + weight + ", Price: " + price;
    }
}