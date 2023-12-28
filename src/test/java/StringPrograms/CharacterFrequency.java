package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "Hello, World! 12345";

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to lowercase (optional)
        inputString = inputString.toLowerCase();

        // Loop through each character in the string
//        for (char c : inputString.toCharArray()) {
//            // Check if the character is alphanumeric
//            if (Character.isLetterOrDigit(c)) {
//                // Increment the count for this character in the map
//                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//            }
//        }

        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }

    }
}
