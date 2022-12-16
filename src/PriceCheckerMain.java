import java.util.Scanner;

public class PriceCheckerMain {

    public PriceCheckerMain() {
        final int bookPrice = 500;
        final int bagPrice = 200;
        final int shoePrice = 300;

    }

    public static void main(String[] args) {
        String finalResponse;
        PriceChecker priceChecker = new PriceChecker();
        do {


            System.out.println(priceChecker.mainMenu());
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("How many books would you like to buy?");
            } else if (option == 2) {
                System.out.println("How many bags do you want to buy?");
            } else if (option == 3) {
                System.out.println("How many shoes do you want to buy?");

            } else {
                System.out.println("invalid entry");
            }
            int quantity = scanner.nextInt();

            if (option == 1 && quantity >= 1) {
                System.out.println(priceChecker.totalAmountBook(quantity));
            } else if (option == 2 && quantity >= 1) {
                System.out.println(priceChecker.totalAmountBag(quantity));
            } else if (option == 3 && quantity >= 1) {
                System.out.println(priceChecker.totalAmountShoe(quantity));
            }
            System.out.println("Do you want to continue?");
            finalResponse = scanner.next();

        }
        while  (finalResponse.equalsIgnoreCase("yes") );

        System.out.println("Thanks for checking. Hava a nice day");
        }

                }


