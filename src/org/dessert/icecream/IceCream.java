package org.dessert.icecream;

public class IceCream {

    private String color;
    private String flavor;
    private int price;

    IceCream(String color, String flavor) {
        this.color = color;
        this.flavor = flavor;
    }

    IceCream() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    private void calculatePrice() {
        int price = 0;

        switch (color){
            case "red":
                price = 10;
                break;
            case "green":
                price = 15;
                break;
            case "blue":
                price = 5;
                break;
            case "white":
                price = 20;
                break;
            default:
                price = 25;
                break;
        }

        switch (flavor) {
            case "vanilla":
                price += 5;
                break;
            case "strawberry":
                price += 10;
                break;
            case "chocolate":
                price += 15;
                break;
            default:
                price += 20;
                break;
        }

        this.price = price;
    }

    public static void main(String args[]) {

        IceCream myChocolateIceCream = new IceCream("white", "chocolate");
        IceCream myCustomIceCream = new IceCream();
    }
}
