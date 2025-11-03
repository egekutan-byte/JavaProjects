import java.util.Scanner;


public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String a = sc.nextLine();
        System.out.println("Age:");
        int b = sc.nextInt();
        System.out.printf("Hello %s your age is %d",a,b);
        b++;
        System.out.printf(".Your age will be %02d in next year!",b);

    }
}