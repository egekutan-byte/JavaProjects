import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 quiz scores :");
        double q1 = sc.nextDouble();
        double q2 = sc.nextDouble();
        double q3 = sc.nextDouble();
        System.out.print("Enter the final exam score :");
        double finalExam = sc.nextDouble();
        double avgQuiz = (q1+q2+q3)/3.0;
        double finalGrade = avgQuiz*0.4 + finalExam*0.6;
        System.out.println("Final Grade :" + finalGrade);
        System.out.printf("Final Grade (2 decimals) : %.2f%n",finalGrade);




    }
}
