/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en12;

/**
 *
 * @author try
 */
public class Ex02 {

    public static void main(String[] args) {

        Student st = new Student("C0116901", 58);
        Student st1 = new Student("C0116902", 64);
        System.out.println("===RAW SCORE===");
        System.out.println(
                st.getSudentId() + "," + st.getScore() + "," + st.isPass());
        System.out.println(
                st1.getSudentId() + "," + st1.getScore() + "," + st1.isPass());
        st.adjust(+5);
       // st1.adjust(-9);
      // st.
       
       System.out.println("===TUNED SCORE===");
        System.out.println(
                st.getSudentId() + "," + st.getScore() + "," + st.isPass());
        System.out.println(
                st1.getSudentId() + "," + st1.getScore() + "," + st1.isPass());
    }

}
