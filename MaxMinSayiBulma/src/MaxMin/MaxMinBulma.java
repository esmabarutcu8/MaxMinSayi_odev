package MaxMin;
import java.util.Scanner;
public class MaxMinBulma {
    public static void main(String[]args){
        int sayi,deger;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        sayi=input.nextInt();
        int maks=0;
        int min=0;
        for(int i=1; i<=sayi; i++){
            System.out.println(i+".sayıyı giriniz:");
            deger=input.nextInt();
            if(i==1){
                maks=deger;
                min=deger;
            }
            if (deger>maks)
                maks=deger;

            if (deger<min)
                min=deger;
        }
        System.out.println("En büyük sayı:"+maks);
        System.out.println("En küçük sayı:"+min);


        }



    }

