import java.util.Scanner;

public class AnalyzingExamsResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passed = 0;
        int failed = 0;


        for (int i =1; i<=10; i++) {
            System.out.println("Enter result");
            int examsResult = input.nextInt();

            if (examsResult == 1) {
                passed += 1;
            } else if (examsResult == 2) {
                failed += 1;
            } else {
                System.out.println("invalid input");
            }


        }
        System.out.printf("the total number of passes is %d%n The total number of failure is %d%n", passed, failed);
            if (passed >= 8){
                System.out.println("Bonus to instructor");

        }
    }
}