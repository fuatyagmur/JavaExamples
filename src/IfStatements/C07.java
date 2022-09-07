package IfStatements;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("haftasonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("haftaici");

        } else {
            System.out.println("hatali giris");

        }
    }
}
