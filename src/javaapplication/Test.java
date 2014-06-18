/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

import javaapplication1.Swap;

/**
 *
 * @author VodzianovaE
 */
public class Test {

public void toStr(String s){  
System.out.println(Integer.toHexString(System.identityHashCode(s)));  
}  
  
public static void main(String[] args){  
Test ob = new Test();  
System.out.println(ob);  
String sob1 = new String("Hello");
String sob2 = new String("Hello");
System.out.println("We will compare references to 2 objects sob1 and sob2");
ob.toStr(sob1);
ob.toStr(sob2);
System.out.println("As we can see they are different.");
System.out.println("Now we will compare references to the same literal");
sob1 = "hello";
ob.toStr(sob1);
sob2 = "hello";
ob.toStr(sob2);  
System.out.println("As we see the reference is the same. So we have proven that:"); 
System.out.println("Literal strings within the same class in the same package represent"
        + " references to the same String object"); 
System.out.println("Now we will check \"within other class and in the other package\"");
Swap swapObj = new Swap();
System.out.println(swapObj);
String swapob1 = new String("Hello");
String swapob2 = new String("Hello");
swapObj.toStr(swapob1);
swapObj.toStr(swapob2);
swapob1 = "hello";
ob.toStr(swapob1);
swapob2 = "hello";
ob.toStr(swapob2); 
System.out.println("As we can see the references are different, however, Literal string \"hello\" referebnces to the same memory address");
}  
}
