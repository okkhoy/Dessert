package org.dessert.icecream;

import java.util.ArrayList;

public class IceCream {

    private String color;
    private String flavor;
    private int price;

    private static int totalIceCreams = 0;
    private static ArrayList<IceCream> soldIceCreams = new ArrayList<>();

    IceCream(String color, String flavor) {
        this.color = color;
        this.flavor = flavor;
        IceCream.totalIceCreams ++;
    }

    IceCream() {
        IceCream.totalIceCreams ++;
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

    public static int getTotalIceCreams() {
        return totalIceCreams;
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

    public String makeIceCream() {
        return "Here you go: " + this.color + " colored, " + this.flavor + " flavored ice cream!\n";
    }

    public void deliverIceCream() {
        this.calculatePrice();
        String iceCream = makeIceCream();
        int price = this.getPrice();
        System.out.println(iceCream + price);

        soldIceCreams.add(this);
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + "| Flavor: " + this.getFlavor() + "| Price: " + this.getPrice();
    }

    public static void main(String args[]) {

        System.out.println("Before selling items :" + IceCream.soldIceCreams);

        IceCream myChocolateIceCream = new IceCream("white", "chocolate");
        IceCream myCustomIceCream = new IceCream();
        myChocolateIceCream.makeIceCream();
        myChocolateIceCream.deliverIceCream();

        System.out.println("After selling choc. ice cream :" + IceCream.soldIceCreams);

        myCustomIceCream.setColor("red");
        myCustomIceCream.setFlavor("vanilla");
        myCustomIceCream.makeIceCream();
        myCustomIceCream.deliverIceCream();

        System.out.println("Total ice creams dispensed today: " + IceCream.getTotalIceCreams());

        System.out.println("After selling custom ice cream :" + IceCream.soldIceCreams);
    }
}
