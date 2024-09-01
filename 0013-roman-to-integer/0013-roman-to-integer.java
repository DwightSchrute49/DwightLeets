import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        // Map to store the value of each Roman numeral symbol
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Variable to store the resulting integer
        int result = 0;

        // Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral
            int currentVal = romanMap.get(s.charAt(i));

            // Check if the current character is not the last one and compare it with the next character
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                // If the current value is less than the next value, subtract it from the result
                result -= currentVal;
            } else {
                // Otherwise, add it to the result
                result += currentVal;
            }
        }

        // Return the resulting integer
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test cases
        System.out.println(solution.romanToInt("III"));      // Output: 3
        System.out.println(solution.romanToInt("LVIII"));    // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV"));  // Output: 1994
    }
}
