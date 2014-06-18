/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author VodzianovaE
 */
public class NewG {
    
    public static void main(String[] args){
    List rawList = new ArrayList();
    List<String> slist = new ArrayList<String>();
    rawList = slist;
    rawList.add(8);
    rawList.add("Hi");
    rawList.add("Ciao");
    rawList.add("Hallo");
    printing(rawList);
    }
        
    public static <E> void printing(Collection<E> collection){
    for(Object o:collection){
        System.out.println(o);
    }
    }
}
