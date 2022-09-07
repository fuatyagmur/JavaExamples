package IfStatement2;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {


    /*
      Java yukaridan asagi dogru calisir. Dolayisiyla karsisina cikan ilk sart dogruysa direkt onu bize getirir.
      Bu yuzden istenmeyen durumlari en basa yazmaliyiz ki diger sonuclar dogru calissin. Bu ornekteki gibi olmasi gerekir.
    yani bastan elimine edecegimiz durumlari yazariz.

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN NOTUNUZU GIRINIZ");

        double notsayi= scan.nextDouble();

        if (notsayi<0 || notsayi>100){
            System.out.println("gecersiz sayi");
        }

         else if (notsayi<50) {
            System.out.println("notunuz:D");
        }else if (notsayi>=50 && notsayi<60){
            System.out.println("notunuz:C");
        } else if (notsayi>=60 && notsayi<80){
            System.out.println("notunuz:B");
        } else{
            System.out.println("notunuz:A");
        }


     */



        //kullanicidan 100 uzerinden notunu isteyin.
        // notu harf sistemine cevirip yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not < 50 && not >= 0) {
            System.out.println("Harf notunuz 'D'");
        } else if (not >= 50 && not < 60) {
            System.out.println("Harf notunuz 'C'");
        } else if (not >= 60 && not < 80) {
            System.out.println("Harf notunuz 'B'");
        } else if (not >= 80 && not <= 100) {
            System.out.println("Harf notunuz 'A'");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }

        /* 3. VE DAHA KISA YONTEM

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not < 50 && not >= 0) {
            System.out.println("Harf notunuz 'D'");
        } else if (not < 60) {
            System.out.println("Harf notunuz 'C'");
        } else if (not < 80) {
            System.out.println("Harf notunuz 'B'");
        } else if (not <= 100) {
            System.out.println("Harf notunuz 'A'");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }

         */
    }
}
