package com.maryanne;

import java.util.Scanner;

public class App {

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("EnterPlain Text >> ");
        String plain = scan.nextLine();

        System.out.print ("Enter Key >> ");
        int Key = scan.nextInt();

        encoding cipherText = new encoding(plain, Key);

        System.out.println("The cipher text: " + cipherText);

        System.out.println("the decoded message is: " + new decoding(cipherText, Key));
    }


}
