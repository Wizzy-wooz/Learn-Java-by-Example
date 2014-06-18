/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author VodzianovaE
 */
public class BetterProgrammerTask {
     static int amount = 0;
     public static void main(String[] args) {
        BetterProgrammerTask.getSumOfNumbers("test123tes     t444testefff333");
    }
     
     
     public static int getSumOfNumbers(String s) {
        
         /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
         
         Pattern pattern = Pattern.compile("\\d+");
         String word = s; 
         Matcher matcher = pattern.matcher(word);
         int start = 0;
         while (matcher.find(start)) {
         String value = word.substring(matcher.start(), matcher.end());
         int result = Integer.parseInt(value);
         System.out.println(result);
         amount = amount + result;
         start = matcher.end();
         
    }
         System.out.println(amount);
         return amount;
    }
}
