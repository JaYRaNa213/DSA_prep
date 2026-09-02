class permutaion_in_string {

    public boolean isFreqSame(int[] freq1, int[] freq2) {   // O(1)

        for (int i = 0; i < 26; i++) {

            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }


    public boolean checkInclusion(String s1, String s2) {

        // Frequency of characters in s1
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            freq[s1.charAt(i) - 'a']++;
        }

        int windSize = s1.length();


        // Try every possible starting position
        for (int i = 0; i < s2.length(); i++) {

            int windIdx = 0;
            int idx = i;

            int[] windFreq = new int[26];


            // Create frequency of current window
            while (windIdx < windSize && idx < s2.length()) {

                windFreq[s2.charAt(idx) - 'a']++;

                windIdx++;
                idx++;
            }


            // Check whether current window is a permutation of s1
            if (isFreqSame(freq, windFreq)) {   // found
                return true;
            }
        }

        return false;
    }
}