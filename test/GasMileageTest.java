import org.junit.jupiter.api.Test;

public class GasMileageTest {
    @Test

    public void createMilesPerGallon(){
        GasMileage gasMileage = new GasMileage(1,1);
    }
    @Test
        void getTrips(){
        GasMileage gasMileage = new GasMileage(1,1);
        gasMileage.tripDetails(1,1);
    }
}

