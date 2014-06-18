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
public class ParentClass implements NewInterface{
    private int id;
    private String name;
    private int age;

    public ParentClass(int id) {
        this ("John Doe");
        this.id = id;
        System.out.println("Inside first constructor");
    }

    public ParentClass(String name) {
        this.name = name;
        System.out.println("Inside second constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
            
    public static void main(String[] args){
        ParentClass pc1 = new ParentClass(1);
        ParentClass pc2= new ParentClass(2);
        ParentClass pc3 = new ParentClass(3);
        System.out.println(pc1.getName());
        System.out.println(pc2.getName());
        System.out.println(pc3.getName());
    }
}
