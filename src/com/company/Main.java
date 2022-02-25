package com.company;

import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("It works!");
        obj.greet();

        int age = obj.askAboutAgetest(0);

        System.out.println(age);

    }

    public void greet(){

        System.out.println("Indtast dit navn --> ");
        String name = input.nextLine();

        System.out.println("Hej navn " + name);
    }

    public int askAboutAgetest(int age){

        System.out.println("Indtast din alder --> ");
        age = input.nextInt();

        return age;
    }
}
