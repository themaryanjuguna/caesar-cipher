package com.maryanne;

public class encoding {
    private String mPlain;
    private int mKey;
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public encoding(String plain, int key) {
        mPlain = plain;
        mKey = key;
    }

    public static String encoding(String plainText, int Key) {
            plainText = plainText.toLowerCase();
            String cipherText = "";
            for (int i = 0; i<plainText.length(); i++) {
                //find out index of the alphabet
                int charIndex = alphabet.indexOf(plainText.charAt(i));
                //generate a new index. key shift value
                int newIndex = (charIndex + Key) % 26;
                // generate cipher characters
                char cipherChar = alphabet.charAt(newIndex);
                cipherText = cipherText + cipherChar;
            }
            return cipherText;

        }



    }

