package IfStatement2;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')){
            System.out.println("girdiginiz karakter : "+ karakter);
        }else {
            System.out.println("Girdiginiz karakter bir harf degildir");
        }



    }
}
