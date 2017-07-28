/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 * 人を表すクラス 人の名前、身長、体重を持ちます
 *
 * @version 1.0
 * @author try
 */
public class Person {

    private String name;
    private double height;
    private double weight;

    public Person(String name, double m, double kg) {
        this.name = name;
        this.height = m;
        this.weight = kg;
    }
/**
 * このインスタントのBMI値を返します
 * 
 * @return 体重[kg]/(身長[m]*身長[m])
 */
    public double getBMI() {
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }
/**
 * 
 * @param w
* @throws IllegalArgumentException 
 */
    public void diet(double w) throws IllegalArgumentException {
        if (w < 0) {
            throw new IllegalArgumentException();
        }
        this.weight -= w;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", m=" + height + ", kg=" + weight + '}';
    }

}
