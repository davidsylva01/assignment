public class PriceChecker {


    private final int bookPrice = 500;
    private final int bagPrice = 200;
    private final int shoePrice = 300;

    private int inputQuantity;
    private int quantity = inputQuantity;
    private int price;
    int totalAmount = quantity * price;
    private int input;


    public boolean mainMenu() {
            System.out.println("Welcome to David's price checker");
            System.out.println("Press 1 for book price");
            System.out.println("Press 2 for bag price");
            System.out.println("Press 3 for Shoe price");

                return true;
        }

    public int getBookPrice() {
        return bookPrice;
    }

    public int getBagPrice() {
        return bagPrice;
    }

    public int getShoePrice() {
        return shoePrice;
    }

  //  public void userInput() {
//        if (input == 1) {
//            System.out.println("How many books would you like to buy?");
//        } else if (input == 2) {
//            System.out.println("How many bags do you want to buy?");
//        } else if (input==3) {
//            System.out.println("How many shoes do you want to buy?");
//
//        }else {
//            System.out.println("invalid entry");
//        }


   // }



    public void inputQuantity(int quantity){
    this.quantity = quantity;
    }

    public int totalAmountBook(int quantity) {
        this.quantity = quantity;
        int totalBook = this.quantity * bookPrice;

        System.out.printf("the unit price for books is %d, %d books will cost",bookPrice, this.quantity);
        return totalBook;
}

    public int totalAmountBag(int quantity) {
        this.quantity=quantity;
        int totalBag = this.quantity * bagPrice;
            System.out.printf("the unit price for a bag is %d, %d books will cost ",bagPrice, quantity);
        return totalBag;
    }

    public int totalAmountShoe(int quantity) {
        this.quantity=quantity;
        int totalShoe = this.quantity * shoePrice;
            System.out.printf("the unit price for a bag is %d, %d books will cost ",shoePrice, quantity);
        return totalShoe;
    }


}
