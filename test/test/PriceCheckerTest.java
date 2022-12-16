package test;

import org.junit.jupiter.api.Test;

public class PriceCheckerTest {

    @Test
    public void CheckerCreation(){
        PriceChecker priceChecker = new PriceChecker();

    }

        @Test
    void homePageTest(){
            PriceChecker priceChecker = new PriceChecker();
        priceChecker.mainMenu();
        }

        @Test
    public void bookPriceTest(){
            PriceChecker priceChecker = new PriceChecker();
            priceChecker.getBookPrice();
        }
    @Test
    public void bagPriceTest(){
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.getBagPrice();
}
    @Test
    public void shoePriceTest() {
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.getShoePrice();
    }
    @Test
    public void receiveInputTest(){
        PriceChecker priceChecker = new PriceChecker();

    }
    @Test
    void quantityTest(){
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.inputQuantity(2);
    }
    @Test
    void totalAmountBookTest(){
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.totalAmountBook(3);
    }

    @Test
    void totalAmountBagTest(){
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.totalAmountBag(2);
    }

    @Test
    void totalAmountShoesTest(){
        PriceChecker priceChecker = new PriceChecker();
        priceChecker.totalAmountShoe(3);
    }

}
