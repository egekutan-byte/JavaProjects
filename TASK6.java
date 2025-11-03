import java.util.Scanner;

public class TASK6{
    public static void main(String[] args) {
        System.out.print("Enter the temperature value as Celcius : ");
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        double fahrenhait = celcius * 9 / 5.0 + 32 ;
        System.out.printf("%df°C = %.1f°F%n",celcius,fahrenhait);



    }
}