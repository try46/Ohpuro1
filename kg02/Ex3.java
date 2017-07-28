/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg02;

/**
 *
 * @author try
 */
public class Ex3 {

    public static void main(String[] args) {

        Box b = new Box();
        b.setWidth(5);
        b.setHeight(3);

        int area = b.getArea();
        System.out.println("AREA: " + area);
    }
}
