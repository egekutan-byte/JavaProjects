import java.util.Scanner;

public class Scenario3 {
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int factorial=factorial(a);
        System.out.println(factorial);
    }
}
