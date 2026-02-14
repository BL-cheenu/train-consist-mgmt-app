public class PassengerBogie {
    String type;
    int capacity;

    // Constructor that validates capacity
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // Check if capacity is invalid
        if (capacity <= 0) {
            // Throw custom exception if capacity is invalid
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        // Assign values if capacity is valid
        this.type = type;
        this.capacity = capacity;
    }
}
