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
public class Kadai02 {

    public static void main(String[] args) {
        
        System.out.println("Total price:" + Item.getTotalPrice());
        Item[] items = new Item[3];
        items[0] = new Item("Water", 100);
        items[1] = new Item("Yogurt", 138);
        items[2] = new Item("Sandwich", 289);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getProperties());
           
        }

        System.out.println("Total price:" + Item.getTotalPrice());

    }
}
