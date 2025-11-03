import java.util.Random;
import java.util.Scanner;

public class Scenario3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(1000);
        System.out.println(x);
        int y = randomGenerator.nextInt(1000);
        System.out.println(y);
        int o=sc.nextInt();
        switch (o){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                if(y==0){
                    System.out.println("You cant make a division with zero,sorry mate!");
                }else {
                    System.out.println(x/y);
                }
                break;
            default:
                System.out.println("Unvalid operation,try again!");
        }



    }
}
