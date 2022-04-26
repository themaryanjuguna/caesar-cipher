package com.maryanne;

import java.util.Locale;

public class encoding {
    private String mPlain;
    private int mKey;

    public encoding(String plain, int key) {
        mPlain = plain;
        mKey = key;
    }

    public String getmPlain() {
        return mPlain;
    }

    public void setmPlain(String mPlain) {
        this.mPlain = mPlain;
    }

    public int getmKey() {
        return mKey;
    }

    public void setmKey(int mKey) {
        this.mKey = mKey;
    }

    public String encoding() {
       String alphabet = "abcdefghijklmnopqrstuvwxyz";
         String plainText = getmPlain().toLowerCase();
         int key = getmKey();
            String cipherText = "";
            for (int i = 0; i<plainText.length(); i++) {
                //find out index of the alphabet
                int charIndex = alphabet.indexOf(plainText.charAt(i));
                //generate a new index. key shift value
                int newIndex = (charIndex + key) % 26;
                // generate cipher characters
                char cipherChar = alphabet.charAt(newIndex);
                cipherText = cipherText + cipherChar;
            }
            return cipherText;

        }



    }

