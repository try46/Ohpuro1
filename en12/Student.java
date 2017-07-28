/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en12;

/**
 *学生を表すクラスです
 * <p>
 * このクラスは学籍番号studentIdと得点scoreをフィールドとして持ちます。
 * </p>
 * @author try
 */
public class Student {

    private String studentId;
    private int score;

    public Student(String studentId, int score) {
        this.studentId = studentId;
        this.score = score;
    }

    public String getSudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }
/**
 * この学生が合格か不合格かを判断します
 * 
 * @return このインスタンスのscoreが60以上の場合trueを返します。そうでない場合falseを返します
 *
 */
    public boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }
/**
 * この学生の得点を調整します。引数の値がこのインスタンスのscoreに足されます。引数に負の値を入れることもできます。
 * @param diff scoreに足す値
 */
    public void adjust(int diff) {
        this.score += diff;
    }
}
