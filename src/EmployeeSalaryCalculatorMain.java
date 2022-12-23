import java.util.Scanner;

public class EmployeeSalaryCalculatorMain {
    private static int hours;
    private static int rate;

    public static void main(String[] args) {
        double grossPay;
        if(hours<=40){
    grossPay = hours * rate;}
    else {
            grossPay = hours * rate * 1.5;
        }
        Scanner input = new Scanner(System.in);


            EmployeeSalaryCalculator firstEmployee = new EmployeeSalaryCalculator();
            int hours = input.nextInt();
            System.out.println("input hours worked for first worker");
            double rate = input.nextDouble();
            System.out.println("input hours worked for first worker");










    }
}
