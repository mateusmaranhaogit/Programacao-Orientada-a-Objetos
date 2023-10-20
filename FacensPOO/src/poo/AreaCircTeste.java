
package poo;

import poo.AreaCirc;

public class AreaCircTeste {
   public static void main(String[]args){
       AreaCirc a1 = new AreaCirc(10);
       //System.out.println(a1.calcular());
       //a1.setPi(5);
       System.out.println(a1.calcular());
       //a1.setPi(10);
       //AreaCirc.pi = 3.14;
       System.out.println(a1.calcular());
       AreaCirc a2 = new AreaCirc();
       System.out.println(a2.calcular(10));
   }
}
