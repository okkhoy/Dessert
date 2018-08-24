package org.dessert.icecream;

public class IceCream {

    private String color;
    private String flavor;
    private int price;

    IceCream(String color, String flavor) {
        this.color = color;
        this.flavor = flavor;
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

    public static void main(String args[]) {

    }
}
