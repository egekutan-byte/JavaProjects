import java.util.Scanner;

public class Scenario2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a= sc.nextInt();
        System.out.println("Enter the last integer");
        int b= sc.nextInt();
        int toplam=0;
        for(int number=a;number<=b;number++){
            toplam=toplam+number;



        }
        System.out.println(toplam);

    }
}