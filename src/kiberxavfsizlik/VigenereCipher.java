package kiberxavfsizlik;

import java.util.Scanner;

/**
 * Created by: Umar
 * DateTime: 10/4/2024 12:05 PM
 */
public class VigenereCipher {
    public static String encrypt(String plainText, String key) {
        StringBuilder encryptedText = new StringBuilder();
        plainText = plainText.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0,j=0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);

            if(currentChar > 'A' && currentChar < 'Z') {


                char encryeptedLetter = (char)((currentChar + key.charAt(j) -2*'A') % 26+'A');
                encryptedText.append(encryeptedLetter);
                j= (j+1)%key.length();
            }else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ochiq matnni kiriting: ");
        String plainText = sc.nextLine();

        System.out.print("Kalitni kiriting: ");
        String key = sc.nextLine();


        String encryptedText = encrypt(plainText, key);
        System.out.println("Shifr: " + encryptedText);

    }
}
