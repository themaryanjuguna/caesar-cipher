
package com.maryanne;

import java.util.Scanner;

public class App {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Jambo! Welcome to Caeser Cipher, to continue input \n 1. Encrypt \n 2. Decrypt \n 3. Exit");
        int userInput = scanner.nextInt();
        scanner.nextLine();

        if(userInput == 1){
            System.out.println("Enter a text to be Encrypted ");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key to Decrypt ");

            int key = scanner.nextInt();
            encoding encoding = new encoding(inputText, key);
            System.out.println(String.format("Your encrypted text is :  %s", encoding.encoding()));

        }
    }


}

