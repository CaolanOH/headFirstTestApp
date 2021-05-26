package com.mycompany.myfirstapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caolanohagan
 */
public class MyFirstApp {
 
    public static void main(String[] args){
        System.out.println("----- This section is for print statements -----");
        System.out.println("I Rule!");
        System.out.println("The World");
        System.out.println("----- This section is for print statements -----");
        
// Statement: declarations, assignments, method calls etc..
        System.out.println("----- This section is for declarations, assignments, method calls etc -----");
        int  numX = 3;
        String name = "Dirk";
        numX = numX + 17;
        System.out.println("x is "+ numX);
        double d = Math.random();
        System.out.println(d);
        System.out.println("----- This section print declarations, assignments, method calls etc -----");
        // Loops: for() and while()
        System.out.println("----- This section is for loops -----");
        int x = 0;
        while(x < 12){
            x = x + 1;
        System.out.println("Value of x from the while loop is " + x);
        }
        for(x = 0; x < 10; x = x + 1){
            System.out.println("The value of x from the for loops is "+ x);
        }
        System.out.println("----- This section is for condidtions/branching -----");
        int conditionalX = 2;
        if (conditionalX == 4){
            System.out.println("x must be 4");
        } else {
            System.out.println("x isnt 4");
        }
        if( (conditionalX < 3) & (name.equals("Dirk")) ){
            System.out.println(name + " Gently");
        }
        System.out.println("----- This section is for condidtions/branching -----");
    }    
}
