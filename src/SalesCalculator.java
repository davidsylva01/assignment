import java.util.Scanner;

public class SalesCalculator {

    public static void main(String[] args) {
        final double product1 = 2.98;
        final double product2 = 4.50;
        final double product3 = 9.98;
        final double product4 = 4.49;
        final double product5 = 6.87;
        double totalRetailValue = 0;
        int count = 0;
        double grandTotal = 0;

        Scanner input = new Scanner(System.in);

        int productNumber = 0;
        int quantitySold = 0;

        do {


            System.out.println("enter product number");
            productNumber = input.nextInt();
            if (productNumber != 0 && productNumber <= 5) {
                System.out.println("enter quantity sold");
                quantitySold = input.nextInt();
                productNumber++;


                switch (productNumber - 1) {

                    case 1:
                        System.out.println("total is " + (quantitySold * product1));
                        break;
                    case 2:
                        System.out.println("total is " + (quantitySold * product2));
                        break;
                    case 3:
                        System.out.println("total is " + (quantitySold * product3));
                        break;
                    case 4:
                        System.out.println("total is " + (quantitySold * product4));
                        break;
                    case 5:
                        System.out.println("total is " + (quantitySold * product5));
                        break;

                }
                grandTotal = grandTotal + (quantitySold * productNumber++);
            }



            {
                if (productNumber == 0) {
                    System.out.println("Total value of all products sold is" + grandTotal);
                }
            }

        }while (productNumber !=0);
    }
}



