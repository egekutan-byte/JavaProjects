import java.util.Scanner;

public class Variables1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("midterm grade:");
        int midtermgrade= sc.nextInt();
        System.out.println("final grade:");
        int finalgrade=sc.nextInt();
        System.out.println("take home average:");
        double takehomeaverage= sc.nextDouble();
        System.out.println("Enter the lowest grade:");
        int lowestgrade= sc.nextInt();
        takehomeaverage*=5;
        takehomeaverage-=lowestgrade;
        takehomeaverage/=4;
        double overall= midtermgrade*0.28+finalgrade*0.43+takehomeaverage*0.29;
        System.out.println(overall);


    }
}
