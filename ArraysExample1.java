import java.util.Scanner;

public class ArraysExample1{
    public static void main(String[] args) {
        int[] passwords={2021,1023,9929};
        Scanner sc=new Scanner(System.in);
        int password= sc.nextInt();
        for(int x=0;x<passwords.length;x++){
            if(password==passwords[x]){
                System.out.println("Welcome!");
            }else if(password!=passwords[0] && password!=passwords[1] && password!=passwords[2]){
                System.out.println("Try again!");
            }
        }
    }
}



