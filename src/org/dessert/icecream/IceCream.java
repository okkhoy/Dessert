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
        return "Here you go: " + this.color + " colored, " + this.flavor + " flavored ice cream!";
    }

    public String getPrice () {
        int price = 0;

        switch (color){
            case "red":
                price = 10;
                case ""
        }
        return "Your ice cream costs: $" + this.price;
    }

    public static void main(String args[]) {

        IceCream myIceCream = new IceCream();
        myIceCream.setColor("red");
        myIceCream.setFlavor("vanilla");


        return;
    }
}
