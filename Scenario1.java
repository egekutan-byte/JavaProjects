import java.util.Scanner;

public class Scenario1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("satır sayı gir");
        int satır= sc.nextInt();
        String yıldız="*";
        for (int i =0; i<satır; i++){

            System.out.println(yıldız);
            yıldız+="*";


        }
    }
}
