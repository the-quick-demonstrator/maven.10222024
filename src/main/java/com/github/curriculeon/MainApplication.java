package com.github.curriculeon;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a person's name");
        String userInput = scanner.nextLine();
        Person person = Person.valueOf(userInput);
    }
}
