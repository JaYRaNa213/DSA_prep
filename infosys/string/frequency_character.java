public class frequency_character {

    public static void main(String[] args) {
        String s = "banana";
        int freq[] = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Print character and frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " = " + freq[i]);
            }
        }
    }
}
