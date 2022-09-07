package IfStatements;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        //Dikdortgenin kenar uzunluklarini iste ve kare olup olmadigini hesapla

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        int kenar4= scan.nextInt();


        if (kenar1 == kenar2 && kenar3 == kenar4 && kenar1==kenar3){
            System.out.println("Bu bir karedir");
        }else {
            System.out.println("Bu bir kare degildir");
        }


    }
}
