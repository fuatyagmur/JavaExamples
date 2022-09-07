package IfStatement2;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz. \n Kadin icin K \n Erkek icin E");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasiniz giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas<0 || yas >120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<60){
                System.out.println("emekli olamazsin daha \n"+ (60-yas)+ " yil calisman gerek");
            }else {
                System.out.println("emekli olabilirsin");
            }




        }else if (cinsiyet == 'E'){
            if (yas<0 || yas >120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol ediniz");
            }else if (yas<65){
                System.out.println("emekli olamazsin daha \n"+ (65-yas)+ " yil calisman gerek");
            }else {
                System.out.println("emekli olabilirsin");
            }







        }else {
            System.out.println("Lutfen gecerli bir harf giriniz");
        }




    }



}
