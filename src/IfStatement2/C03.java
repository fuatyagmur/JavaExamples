package IfStatement2;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Girdiginiz sayilarin toplami: " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("Girdiginiz sayilarin carpimi" + (sayi1 * sayi2));
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsiniz");
        } else   {
            System.out.println("Sifir yutan elemandir");
        }
    }
}
