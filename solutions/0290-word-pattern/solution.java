class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        // If the number of characters doesn't match the number of words, it's not a pattern
        if (pattern.length() != words.length) {
            return false;
        }
        
        // Map to store char -> word relation
        Map<Character, String> charToWord = new HashMap<>();
        // Map to store word -> char relation to ensure bijection
        Map<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // Check char -> word mapping
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c, word);
            }
            
            // Check word -> char mapping
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;
                }
            } else {
                wordToChar.put(word, c);
            }
        }
        
        return true;
    }
}
