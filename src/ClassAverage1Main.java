import java.util.Scanner;

public class ClassAverage1Main {
    private static int grade;
    private static double totalGrade;
    private static double classAverage = 1;

    public static void main(String[] args) {
        ClassAverage1Main classAverage1Main = new ClassAverage1Main();
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=10; i++){
            System.out.println("enter student's grades between 1 and 100");
            grade = input.nextInt();
        }
        classAverage = classAverage;
        totalGrade += grade;
       double classAverage = (totalGrade / 10);

        System.out.printf("The total grade for the 10 students is %.2f%n,the class average is %.2f", totalGrade, classAverage);
    }
}
