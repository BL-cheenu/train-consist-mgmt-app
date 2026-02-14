/**
 * UC14 – Handle Invalid Bogie Capacity using Custom Exception
 *
 * Hint:
 * - Create a custom exception class.
 * - Validate bogie capacity in constructor.
 * - Throw exception if capacity is zero or negative.
 * - Handle the exception using try–catch in main().
 *
 * @author Developer
 * @version 14.0
 */
public class UC14HandleInvalidBogieCapacity {
    public static void main(String[] args) {

        try {
            // Attempt to create bogie with invalid capacity
            PassengerBogie bogie = new PassengerBogie("Sleeper", -5);

            // If capacity is valid, display bogie details
            System.out.println("Bogie Created: " + bogie.type +
                    " Capacity: " + bogie.capacity);

        } catch (InvalidCapacityException e) {
            // Handle exception and display error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
