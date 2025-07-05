import java.util.Random;



public class PassengerSource {
    private final Company company;
    private final Random random;

    // Constructor taking a Company object
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public PassengerSource(Company company, Random random) {
        this.company = company;
        this.random = random;
    }

    // Method to request a pickup
    public boolean requestPickup() {
        Passenger passenger = new Passenger(generateRandomLocation(), generateRandomLocation());
        return company.schedulePickup(passenger);
    }

    private Location generateRandomLocation() {
        int x = random.nextInt(101); 
        int y = random.nextInt(101); 
        return new Location(x, y);
    }
}









