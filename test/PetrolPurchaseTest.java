import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    @Test
    public void petrolPurchaseInitializationTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertNotNull(petrolPurchase);
    }

    @Test
    public void getLocationTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        petrolPurchase.setLocation("yaba");
        assertEquals("yaba", petrolPurchase.getLocation());
    }

    @Test
    public void getPetrolTypeTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        petrolPurchase.setPetrolType("diesel");
        assertEquals("diesel", petrolPurchase.getPetrolType());
    }

    @Test
    public void getQuantityTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertEquals(20, petrolPurchase.getQuantity());
    }

    @Test
    public void getPricePerLitreTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertEquals(10, petrolPurchase.getPricePerLitre());
    }

    @Test
    public void getPercentageDiscountTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertEquals(10, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void getPurchaseAmountTest(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", "diesel", 20, 10, 10);
        assertEquals(180, petrolPurchase.getPurchaseAmount());
    }
}