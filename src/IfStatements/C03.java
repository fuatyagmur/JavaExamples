package IfStatements;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi bir cift sayidir");
        }
        if (sayi % 2 != 0) {
            System.out.println("Girdiginiz sayi bir tek sayidir");
        }
        if (sayi % 2 == 1) {
            System.out.println("tek sayi");
        }


        if (sayi % 2 == 0) {
            System.out.println("CIFT");
        } else {
            System.out.println("TEK");

        }
    }
}
