/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;
import java.util.Arrays;

/**
 *
 * @author VodzianovaE
 */
public class BetterProgrammerTask2 {
    static  String array[]={" Hello " , " This " , "is ", "Sorting ", "Example"};
    public static void main(String[] args) {
        BetterProgrammerTask2.sortIgnoringSpaces(array);
    }
    public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
       Arrays.sort(a);
       for(int i = 0; i<a.length-1;i++){
        System.out.println(a[i]); 
       }
        
    }
}
