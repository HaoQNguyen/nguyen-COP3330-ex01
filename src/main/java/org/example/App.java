/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print( "What is your name? " );
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.printf("Hello %s, nice to meet you!", name);
    }
}
