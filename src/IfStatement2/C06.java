package IfStatement2;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        }else if (sayi%5 == 0){
            if (sayi%10 == 0){
                System.out.println("5 e bolunebilen cift sayi");
            }else {
                System.out.println("5 e bolunebilen tek sayi");
            }

        }else {
            System.out.println("Tekrar deneyin");


        }
    }
}
