package lab4.taskA;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lab6.a.task(1,2,3):");
        int task = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter text:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        switch (task){
            case 1:{
                replace(text);
                System.out.println("Result: "+text);
                break;
            }
            case 2:{
                remove(text);
                System.out.println("Result: "+text);
                break;
            }
            case 3:{
                System.out.println("Enter the separating characters:");
                String characters = scanner.nextLine();
                splitCharacters(text, characters);
                System.out.println("Result: ");
                for (String word : text.toString().split("\0")) {
                    System.out.println(word);
                }
                break;
            }
        }
    }
    public static void replace(StringBuilder text) {
        int start = -1;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == '#' && text.charAt(i + 1) == '#') {
                if (start == -1) {
                    text.setCharAt(i, '<');
                    text.deleteCharAt(i + 1);
                    start = i;
                } else {
                    text.setCharAt(i, '>');
                    text.deleteCharAt(i + 1);
                    start = -1;
                }
            }
        }
        if (start != -1) {
            text.setCharAt(start, '#');
            text.insert(start + 1, '#');
        }
    }

    public static void remove(StringBuilder text) {
        int in = -1;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == '/' && text.charAt(i + 1) == '*') {
                in = i;
            } else if (in != -1 && text.charAt(i) == '*' && text.charAt(i + 1) == '/') {
                text.delete(in, i + 2);
                i = in - 1;
                in = -1;
            }
        }
    }

    public static void splitCharacters(StringBuilder text, String characters) {
        for (int i = 0; i < text.length(); i++) {
            if (characters.indexOf(text.charAt(i)) != -1) {
                text.setCharAt(i, '\0');
            }
        }
    }
}