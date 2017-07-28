/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

/**
 *
 * @author try
 */
public class Kadai04 {
	public static void main(String[] args) {
		String istr1="192-0982";
		String istr2="<100%>Let's Java!</100%> <small>It's fun!</small>";
		String ostr;
		System.out.println(istr1);
		ostr=istr1.replaceAll("(\\d+)-(\\d+)","$2-$1");
		System.out.println(ostr);
		System.out.println(istr2);
		ostr=istr2.replaceAll("<.+?>","" );
		System.out.println(ostr);
		ostr=istr2.replaceAll("<.+?>(.+?)</.+?>", "($1)");
		System.out.println(ostr);

	}
}
