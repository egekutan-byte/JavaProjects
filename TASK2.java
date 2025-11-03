import java.util.Scanner;

public class TASK2{
    public static void main(String[] args) {
        System.out.print("Enter your float : ");
        Scanner sc=new Scanner(System.in);
        float f1= sc.nextFloat();
        int i1= (int) f1;
        System.out.println("f1 = " + f1 + "i1 ="+i1);

        System.out.print("Enter your int = ");
        int i2 = sc.nextInt();
        int f2 =(int) i2;
        System.out.println("i2 ="+ i2 + ", f2 ="+ f2);




    }
}