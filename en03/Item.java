/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en03;

/**
 *
 * @author try
 */
public class Item {

    private String name;
    private int price;
    private static int total;

    public Item(String nm, int pr) {
        this.name = nm;
        this.price = pr;
        total += price;
    }

    public String getProperties() {
        return this.name + "," + this.price;
    }

    public int getPrice() {
        return price;
    }
    public static int getTotalPrice(){
        return total;
    }

}
