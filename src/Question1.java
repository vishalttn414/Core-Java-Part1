//Write a Java method that takes a character input parameter and determines whether
//        it's a vowel (a, e, i, o, u) or a consonant using a switch statement.

import java.util.Scanner;
public class Question1 {
    public static void vowelCheck(char ch) {
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm': case 'n':
            case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y': case 'z':
                System.out.println(ch + " is a consonant.");
                break;
            default:
                System.out.println(ch + " is not a valid letter.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter a character");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char ch=str.charAt(0);
        vowelCheck(ch);
    }
}

