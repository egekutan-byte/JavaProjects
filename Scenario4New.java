
import java.util.Scanner;

public class Scenario4New {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Enter the third value: ");
        int c = sc.nextInt();

        if((a<=500 && b<=500 && c<=500) && (a>1 && b>1 && c>1)){
            System.out.println("You entered a reasonable value.");

        }
        else{
            System.out.println("You entered an unreasonable value.");
        }



        if (a + b > c && a + c > b && b + c > a) {

            System.out.println("This is a triangle!");
            System.out.println("Perimeter : "+ (a+b+c));

            if (a == b || b == c || a == c) {
                System.out.println("And also an isosleces.");
                if (b == c && a == c) {
                    System.out.println("And also an equilateral.");

                }
            }
            else{

                System.out.println("And also a scalene.");

            }

        }
        else{
            System.out.println("This cannot be a triangle!");
        }








    }
}
