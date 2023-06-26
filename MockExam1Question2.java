import java.util.HashMap;
public class MockExam1Question2 {

    

public static int firstUniqChar(String s) {
    // Create a hashmap to store the frequency of characters
    HashMap<Character, Integer> charFreq = new HashMap<>();

    // Calculate the frequency of each character in the string
    for (char c : s.toCharArray()) {
        charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
    }

    // Iterate through the string to find the first non-repeating character
    for (int i = 0; i < s.length(); i++) {
        if (charFreq.get(s.charAt(i)) == 1) {
            return i;
        }
    }

    // No non-repeating character found
    return -1;
}

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));
    }
}
