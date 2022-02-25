package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("It works!");
        obj.greet();
    }

    public void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast dit navn --> ");
        String name = input.nextLine();

        System.out.println(name);

    };
}
