 import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // System.out.print("Enter an integer");
       // int b = input.nextInt();

      //  System.out.println("Enter Second Integer");
      //  int c = input.nextInt();

       // int a = c * b;

    //    System.out.printf("The product of %d and %d is %d",c,b,a);
    //This program performs a sample payroll calculation

        //Exercise 2.14
       // System.out.println("1,2, 3,4");
       // System.out.print("1,2, 3,4");

        //Exercise 2.15
      //  System.out.print("Enter an integer");
       //     int b = input.nextInt();

       //  System.out.println("Enter Second Integer");
         //     int c = input.nextInt();

         //   int  bSquared = b * b;
         //   int cSquared = c * c;

      //      System.out.printf("The square of the numbers is %d and %d respectively. The sum of the squares is %d and the difference is %d",bSquared,cSquared,(bSquared + cSquared),(bSquared - cSquared) );

        //Exercise 2.16
        //  System.out.print("Enter an integer");
           //  int b = input.nextInt();

          // int  bSquared = b * b;


         //  if (bSquared > 100){
          //     System.out.print("dSquared is too big");
         //  } else if (bSquared < 100) {
         //      System.out.print("dSquared is too small");
         //  } else {
       // System.out.println("perfect");
   // }

//Exercise 2.17
//         System.out.print("Enter an integer");
//          int a = input.nextInt();
//
//        System.out.print("Enter second integer");
//        int b = input.nextInt();
//
//        System.out.print("Enter third integer");
//        int c = input.nextInt();
//
//        int sum = a + b + c;
//        int product = a * b * c;
//        int average = sum / 3;
//
//                System.out.printf("The sum is %d,average is %d, and product is %d",sum,average,product);

        //Exercise 2.28
//        System.out.print("Enter the radius");
//        int radius = input.nextInt();
//
//        System.out.printf("The diameter of the circle is %d%n. The circumference is %.4f%n while the area is %.4f%n",radius * 2,radius * Math.PI * 2,Math.PI * radius * radius);

        //Exercise 2.33
        System.out.print("What is your weight in KG?");
        int weight = input.nextInt();

        System.out.print("What is your height in meters?");
        double height = input.nextDouble();

        System.out.printf("Your Body mass index is %.4f",weight / (height * height));
}}
