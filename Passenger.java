public class Passenger {
    private final Location pickupLocation;
    private final Location dropoffLocation;

    public Passenger(Location pickupLocation, Location dropoffLocation) {
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropoffLocation() {
        return dropoffLocation;
    }
}