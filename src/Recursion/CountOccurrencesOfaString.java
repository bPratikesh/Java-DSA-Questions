package Recursion;

public class CountOccurrencesOfaString {
    public static void main(String[] args) {
        String textInput = "abcabhjhabshdfab";
        String word = "ab";
        System.out.println(count(textInput, word, 0));
    }
    static int count(String textInput, String word, int index ){
        if (index > textInput.length()-word.length()) return 0;

        int subProblem = count(textInput, word, index+1);
        boolean isCharMatching = textInput.substring(index, index+word.length()).equals(word);

        if (isCharMatching) return subProblem + 1;
        else return subProblem;
    }
}