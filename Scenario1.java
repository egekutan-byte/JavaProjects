import java.util.Random;

public class Scenario1 {
    public static void main(String[] args) {
        System.out.println("Create a hour: ");
        Random randomGenerator = new Random();
        int h= randomGenerator.nextInt(24);

        int m= randomGenerator.nextInt(60);
        System.out.println(h+":"+m);
        if(h>m){
            System.out.println("Hour is greater than minute");
        }else if(h<m){
            System.out.println("Minute is greater than hour");
        }else{
            System.out.println("This numbers are equal.");
        }





    }
}
