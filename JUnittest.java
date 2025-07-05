import org.junit.jupiter.api.Test;

public class CompanyTest {


    @Test
    void testSchedulePickup_Failure_NoVehiclesAvailable() {
        // Arrange
        Company company = new Company();
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));

        // Mock the vehicle availability to false
        company.setVehicleAvailability(false);

        // Act
        boolean result = company.schedulePickup(passenger);

        // Assert
        assertFalse(result, "Pickup should not be scheduled if no vehicles are available");
    }
}