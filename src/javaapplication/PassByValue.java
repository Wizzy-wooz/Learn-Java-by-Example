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
public class PassByValue {
    
    public static void main(String[] args){
        ParentClass i = new ParentClass(4);
        ParentClass j;
        j = i;
        i = new ParentClass(4);
        System.out. println("j="+j+" and i="+i);
    }
}
