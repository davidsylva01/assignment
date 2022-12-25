import java.util.Scanner;

public class EmployeeSalaryCalculator {
    private static int numbersOfHoursWorked;
    private static int hourlyRates;


    public static void main(String[] args) {
        numbersOfHoursWorked = 0;
        hourlyRates = 0;


        Scanner input = new Scanner(System.in);
        for (int employee = 1; employee <= 3; employee++,System.out.println()) {
            System.out.println("enter hours worked for employee" + employee);
            numbersOfHoursWorked = input.nextInt();
            System.out.println("enter hourly rate for employee " + employee);
            hourlyRates = input.nextInt();
            grossPay();

        }


        }

    private static void grossPay() {
double grossPay;
        if (numbersOfHoursWorked <= 40) {
             grossPay = numbersOfHoursWorked * hourlyRates;
        } else {
             grossPay = (40 * hourlyRates) + ((numbersOfHoursWorked - 40) * hourlyRates * 1.5);
        }
        System.out.println("\nthe grossPay is " + grossPay);

    }

}

