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
public class Quizful {
    private String tmp;
    
    
    public int getNumber(String str){
        try{
        String tmp = str.substring(0,str.indexOf(','));
            System.out.println(tmp);
        return Integer.parseInt(tmp);
        }
        catch(NumberFormatException e){
        System.out.println("Problem in "+tmp);
    }
    return -1;
    
}
    
    public static void main(String[] args) {
        Quizful q = new Quizful();
        int k = q.getNumber("12,ab");
        System.out.println(k);
    }
}