import java.util.Scanner;
import java.util.Random;


public class Ege {
    public static void main(String[] Args) {
        Random randGen = new Random();
        Scanner sc = new Scanner(System.in);
        int x = randGen.nextInt(1, 11);
        System.out.println("1 ile 10 arasında sayı seç ");
        int girilenSayı = sc.nextInt();
        if (girilenSayı > 10 || girilenSayı < 0) {
            System.out.println("Geçersiz bir sayı girdiniz.");
        } else if (x == girilenSayı) {
            System.out.println("Kazandınız");
        } else {
            System.out.println("Kaybettiniz");
            if (x % 2 == 0) {
                System.out.println("sayı 2 ye bölünüyo");
                int girilenSayı4= sc.nextInt();
            } else {
                System.out.println("Sayı 2 ye bölünmez bir daha deneyin");
                int girilenSayı2 = sc.nextInt();
                if (girilenSayı2 == x) {
                    System.out.println("kazandınız");
                } else {
                    System.out.println("kaybettinz");
                    if (girilenSayı2%3==0){
                        System.out.println("sayı 3 e bölünüyo");
                    }else{
                        System.out.println("sayı 3 e bölünmez");
                        int girilenSayı3= sc.nextInt();
                        if(girilenSayı3==x){
                            System.out.println("Kazandınız!");
                        }
                    }
                }
            }
        }

    }
}

