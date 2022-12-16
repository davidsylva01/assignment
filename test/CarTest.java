import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void carInstantiationTest() {
        Car benz = new Car("gWagon", "2022", 500.00);
        assertNotNull(benz);
    }

    @Test
    public void carModelTest() {
        Car benz = new Car("gWagon", "2022", 500.00);
        benz.setModel("gWagon");
    }

    @Test
    public void carYearTest() {
        Car benz = new Car("gWagon", "2022", 500.00);
        benz.setYear("2022");
    }

    @Test
    public void carPriceTest() {
        Car benz = new Car("gWagon", "2022", 500.00);
        benz.setPrice(500.00);
    }

    @Test
    public void getCarModel() {
        Car benz = new Car("gWagon", "2022", 500.00);
        assertEquals("gWagon", benz.getCarModel());
    }

    @Test
    public void getCarYear() {
        Car benz = new Car("gWagon", "2022", 500.00);
        assertEquals("2022", benz.getCarYear());
    }
    @Test
    void displayCarAndPrice(){
        Car toyota = new Car("2AXCE", "2020", 700.00);
        Car benz = new Car("XLE", "2018", 400.00);

        System.out.println("The model of the car is "+ toyota.getCarModel() + ", the price of the car is "+toyota.getPrice());
        System.out.println("The model of the car is "+ benz.getCarModel() + ", the price of the car is "+benz.getPrice());

        System.out.println("The model of the car is "+ toyota.getCarModel() + ", the new discounted price of the car is "+toyota.getDiscountPriceForFirst());
        System.out.println("The model of the car is "+ benz.getCarModel() + ", the new discounted price of the car is "+benz.getDiscountPriceForSecond());
    }
}