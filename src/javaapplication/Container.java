/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

/**
 *
 * @author VodzianovaE
 * @param <T>
 */
public class Container<T extends Product> {
    public T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    
}
