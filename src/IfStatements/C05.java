package IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunAdi = scan.next().toLowerCase(Locale.ROOT);

        if (gunAdi.equals("pazar") || gunAdi.equals("cumartesi")) {
            System.out.println("haftasonu");
        } else {
            System.out.println("haftaici");


        }
    }
}
