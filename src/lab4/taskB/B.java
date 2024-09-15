package lab4.taskB;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second sentence:");
        String string2 = scanner.nextLine();
        System.out.println("Enter the third sentence:");
        String string3 = scanner.nextLine();
        System.out.println("Result: " + findLongestWord(string1, string2, string3));
    }

    public static String findLongestWord(String string1, String string2, String string3) {
        String longestWord = "";
        String[] words = string1.split(" ");
        for (String word : words) {
            if (string2.contains(word) && string3.contains(word) && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
