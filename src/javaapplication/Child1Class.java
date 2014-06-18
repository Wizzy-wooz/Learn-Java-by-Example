/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

/**
 *
 * @author VodzianovaE
 */
public class Child1Class extends ParentClass{
   private String childName;

    public Child1Class(String childName) {
    super("John Doe Little");
    this.childName = childName;
    }
    
    

    public static void main(String[] args){
        Child1Class cc1 = new Child1Class("cc1");
        Child1Class cc2= new Child1Class("cc2");
        Child1Class cc3 = new Child1Class("cc3");
        NewInterface ni = null;
        NewInterface nIClass = new ParentClass(7);
        System.out.println(cc1.getName());
        System.out.println(cc2.getName());
        System.out.println(cc3.getName());
        System.out.println();
    }
   
    
       
}
