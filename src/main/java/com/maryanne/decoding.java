package com.maryanne;

public class decoding {
    private String mPlain;
    private int mKey;

    public decoding(String plain, int key) {
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

    public String decoding() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String plainText = getmPlain().toLowerCase();
        int key = getmKey();
        String cipherText = "";
        //looping process generating indexes
        for (int i =0 ; i<plainText.length(); i++) {
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            //generate new index in the plain text
            int newIndex = (charIndex - key) % 26;
            if (newIndex <0){
                newIndex = alphabet.length() + newIndex;
            }
            char plainChar = alphabet.charAt(newIndex);
            cipherText += plainChar;

        }
        return cipherText;
    }


}
