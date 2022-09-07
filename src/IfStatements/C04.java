package IfStatements;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi") ){
            System.out.println("Girdiginiz gun Haftasonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz gun haftaici");
        }





    }
}
