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
public class Dot {

    int pos;

    void forward() {
        pos = pos + 1;
    }

    boolean isGreaterThan(int p) {
        if (pos > p) {
            return true;
        } else {
            return false;
        }
    }

}
