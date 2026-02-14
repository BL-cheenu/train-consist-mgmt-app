import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * UC7 – Sort Bogies by Capacity using Comparator
 *
 * Hint:
 * - Create a Bogie class with name and capacity.
 * - Store bogie objects in a List.
 * - Use Comparator to sort bogies based on capacity.
 * - Display the sorted result.
 *
 * @author Developer
 * @version 7.0
 */
public class UC7SortBogiesByCapacity {
    public static void main(String[] args) {

        // Create a list of bogie objects
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        // Sort bogies based on seating capacity using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogie details
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}
