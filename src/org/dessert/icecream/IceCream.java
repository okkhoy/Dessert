package org.dessert.icecream;

public class IceCream {

    private String color;
    private String flavor;
    private int price;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public void makeIceCream() {
        System.out.println("Ice cream ready!");
    }

    public String deliverIceCream() {
        return "Here you go: " + this.color + " colored, " + this.flavor + " flavored ice cream!\n" +
                "Your ice cream costs $" + calculatePrice();
    }

    public int calculatePrice() {
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
        return price;
    }

    public static void main(String args[]) {

        IceCream myIceCream = new IceCream();
        myIceCream.setColor("red");
        myIceCream.setFlavor("vanilla");
        System.out.println(myIceCream.deliverIceCream());

        return;
    }
}
