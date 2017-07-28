/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

/**
 *
 * @author try
 */
public class Student {

    private int score;

    public void setScore(int s) {
        this.score = s;
    }

    public int getScore() {
        return score;
    }

    public boolean isPass() {
        if (score > 70) {
            return true;
        } else {
            return false;
        }
    }
}
