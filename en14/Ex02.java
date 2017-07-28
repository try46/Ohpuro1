/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en14;

/**
 *
 * @author try
 */
public class Ex02 {
    public static void main(String[] args) {
        Box b=new Box(5, 12);
        System.out.println(b);
        System.out.println(b.getDiagonal());
        b.changeSize(2, 12);
        System.out.println(b);
        System.out.println(b.getDiagonal());
    }
}
