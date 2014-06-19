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
public class IsPrime {
    public static boolean isPrime(int N){
    if (N<2) return false;
    for(int i =2; i*i<=N; i++)
        if(N%i==0) return false;
    return true;
    }
}
