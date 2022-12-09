import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Day1 {
    public static void main(String[] args) throws IOException {

        int total = 0;
        String line = "";
        List<Integer> calories = new ArrayList<>();

        // Reading the Input file
        Scanner file = new Scanner(new FileReader("day1_Input.txt"));

        while (file.hasNextLine()) {
            if ((line = file.nextLine()).isBlank()) {
                calories.add(total);
                total = 0;
                continue;
            }
            total += Integer.parseInt(line);
        }

        // Part 1
        // Printing the Highest Calories
        System.out.println(Collections.max(calories));

        // Part 2
        // Printing the Total Calories of Top 3 Highest Calories
        Collections.sort(calories);
        Collections.reverse(calories);
        System.out.println(calories.subList(0, 3).stream().mapToInt(Integer::intValue).sum());
    }

}