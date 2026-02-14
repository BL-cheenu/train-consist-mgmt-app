import java.util.Arrays;
import java.util.List;

/**
 * UC12 – Safety Compliance Check for Goods Bogies
 *
 * Hint:
 * - Create a GoodsBogie class with type and cargo.
 * - Store goods bogie objects in a List.
 * - Convert the list into a stream.
 * - Use allMatch() to check the safety rule:
 *   Cylindrical bogies must carry only Petroleum.
 *
 * @author Developer
 * @version 12.0
 */

public class UC12SafetyComplianceCheck {
    public static void main(String[] args) {
        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        // Check safety compliance:
        // If bogie type is Cylindrical, cargo must be Petroleum
        boolean safe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical")
                        || b.cargo.equals("Petroleum"));

        // Display safety compliance result
        System.out.println("Safety Compliance: " + safe);
    }

}
