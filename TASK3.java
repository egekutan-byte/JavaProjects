import java.util.Scanner;

public class TASK3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money as kuruş:");
        int totalKurus =sc.nextInt();
        int lira = totalKurus/100;
        int kurus = totalKurus%100;
        System.out.printf("Total: %d TL %02d kuruş%n",lira,kurus);
        System.out.println("İnteger division each (kuruş) :" + totalKurus % 3);
        System.out.printf("Floating-point each (TL) : %.2f TL%n", totalKurus/3.0/100.0);
        System.out.println("Leftover (kuruş) : "+ totalKurus % 3);


    }
}