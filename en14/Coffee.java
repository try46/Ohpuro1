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
public class Coffee {

    public int volume;
    public static int total;

    public Coffee(int volume) {
        this.volume = volume;
        total += volume;
    }

    public static int getTotalVol() {
        return total;
    }
}
