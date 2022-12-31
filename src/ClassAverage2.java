import java.util.Scanner;

public class ClassAverage2 {

    public static void main(String[] args) {

        double totalGrades = 0;
        int studentCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student's grades");
        int grade = scanner.nextInt();

        while (grade != -2) {
            totalGrades += grade;
            studentCount += 1;

            System.out.println("Enter grade or -2 to get summary");
            grade = scanner.nextInt();
        }
        double classAverage =  (totalGrades / studentCount);

        if (studentCount != 0) {
            System.out.printf("The class average for the inputted %d students is %.2f%n Total grade for the class is %.2f", studentCount, classAverage, totalGrades);

        }

    }
}