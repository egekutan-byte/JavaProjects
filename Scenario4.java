
import java.util.Scanner;

public class Scenario4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Enter the third value: ");
        int c = sc.nextInt();
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("This is a triangle!");
        }else{
            System.out.println("This cannot be a triangle!");
        }if(a==b || b==c || a==c) {
            System.out.println("And also an isosceles.");
        }if(a!=b && b!=c && a!=c){
            System.out.println("And also a scalene.");
            System.out.println(a+b+c);
        }







    }
}