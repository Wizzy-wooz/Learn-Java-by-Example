/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author VodzianovaE
 */
public class Swap {
   int a = 4;
   int b = 5;
   int temp;
   
   public void swap(int a, int b){
   temp = a;
   a = b;
   b = temp;
   }
   
   public void toStr(String s){  
System.out.println(Integer.toHexString(System.identityHashCode(s)));  
}  
   public static void main(String[] args){
   Swap s = new Swap();
   s.swap(6,7);
   System.out.println("a=" + s.a);
   System.out.println("b="+s.b);
       System.out.println("I want to push to GIT");
   }
}
