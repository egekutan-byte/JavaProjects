import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an hour of the day: ");
        int h=-1;
        h=sc.nextInt();
        if(h>=9 || h<=12){
            System.out.println("You should get back to work mate!");
        } else if(h>=13 || h<=17){
            System.out.println("You should get back to work mate!");
        }else if(h>12 || h<13){
            System.out.println("Break time mate,have fun!");
        }

    }
}
