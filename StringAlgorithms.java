public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
       String string = "";
        // TODO: Implement this method
       for (int a = 0; a < word.length(); a++) {
        string += word.substring(a , a + 1) + "\n";
         
       }
        return string;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String newWord = "";
        for (int b = 0; b < word.length(); b++) {
            newWord += word.substring((word.length() - 1) - b, word.length() - b);
            
        }
        
        return newWord;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String newSentence = "";
        
        for (int i = 0; i < sentence.length(); i++) {
        
        }                  
        return newSentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method 
        if (word.toLowerCase().equals(reverseWord(word).toLowerCase())) 
            return true; 
           
        
         
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        // System.out.println(printCharacters("hello"));
        System.out.print(printCharacters("Hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        // System.out.println(reverseWord("hello"));
        System.out.println(reverseWord("How are you?"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));
        System.out.println(detectPalindrome("Racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}
