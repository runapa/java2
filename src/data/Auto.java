package data;

import enums.Color;
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
}