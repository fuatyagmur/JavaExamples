package InterwiewQuestion4;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi veya harf giriniz");
      /*  int sayi=scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("Giriginiz sayi cift sayidir");
        }
        if (sayi%2 == 1){
            System.out.println("Girdiginiz sayi tek sayidir");
        }
        if (sayi%2 != 0){
            System.out.println("vallahi tek sayi");
        }




       */


        String ilkHarf=scan.next().toLowerCase();


        if (ilkHarf.equals("p")){
            System.out.println("pazartesi, persembe, pazar");
        }
        if (ilkHarf.equals("t")){
            System.out.println("haftanin diger gunleri");
        }



    }
}
