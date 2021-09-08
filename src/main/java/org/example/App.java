package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is your current age?");
        int age, retire, years, year, newyear;
        Scanner integers = new Scanner(System.in);
        age = integers.nextInt();
        System.out.println("At what age would you like to retire?");
        retire = integers.nextInt();
        years = retire - age;
        Date dt = new Date();
        year = dt.getYear() + 1900;
        newyear = year + years;
        System.out.println("You have " + years + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + newyear + ".");
    }
}
