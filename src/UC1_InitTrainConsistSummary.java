import java.util.ArrayList;
import java.util.List;

public class UC1_InitTrainConsistSummary {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> bogies = new ArrayList<>();

        // Display consist summary
        System.out.println("Initial Bogie Count: " + bogies.size());
    }
}
