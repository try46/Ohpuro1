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
public class Kadai02 {

    public static void main(String[] args) {
        //Studentクラスの変数名st1引数無しのインスタンスを作成
        Student st1 = new Student();
        //変数名st1でScoreを67に設定
        st1.setScore(67);
        /*
        以下3行出力
        */
        System.out.println("Student 1");
        System.out.println("SCORE: " + st1.getScore());
        System.out.println("PASS: " + st1.isPass());
        //Studentクラスの変数名st2引数無しのインスタンスを作成
        Student st2 = new Student();
       
        //変数名st2でScoreを83に設定
        st2.setScore(83);
        /*
        以下3行出力
        */
        System.out.println("Student 2");
        System.out.println("SCORE: " + st2.getScore());
        System.out.println("PASS: " + st2.isPass());

    }
}
