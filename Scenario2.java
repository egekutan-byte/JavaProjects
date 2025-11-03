import java.util.Scanner;

public class Scenario2 {
    public static void main(String[] args) {
        System.out.println("Please enter your student ID :");
        Scanner sc=new Scanner(System.in);
        long id=sc.nextLong();
        if(id%2==0 && id%3!=0){
            System.out.println("TEAM ALPHA LETS GOOOOO!");
        }else if(id%5==0 || id%7==0){
            System.out.println("TEAM BETA LETS GOOOOO!");
        }else if(id%9>5){
            System.out.println("THETA TEAM LETS GOOOOO!");
        }else{
            System.out.println("TEAM SIGMA LETS GOOOOO!");
        }



        }




    }

