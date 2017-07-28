/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en13;

/**
 *
 * @author try
 */
public class Student {

    private String id;
    private int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    private String getGrade() {
        if (score >= 80) {
            return "A";
        } else if (score >= 70&&score<=79) {
            return "B";
        } else if (score >= 60&&score<=69) {
            return "C";
        } else {
            return "D";
        }

    }
    public void add(int n){
         score=score+n;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", score=" + score + ","+getGrade();
    }
    
}
