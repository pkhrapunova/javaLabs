package lab3.task3_3;

import java.util.Scanner;

public enum Genre {
    ACTION(14),
    COMEDY(5),
    DRAMA(18),
    UNKNOWN(0);

    private int genreLimit;

    Genre(int genreLimit) {
        this.genreLimit = genreLimit;
    }

    public Genre input(){
       Scanner scanner= new Scanner(System.in);
        Genre[] values = Genre.values();
        for (Genre genre : values) {
            System.out.println(genre.ordinal() + " - " + genre.name());
        }
        System.out.println("Enter genre: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number! Please enter a valid genre:");
            scanner.next();
        }
        int inputGenre = scanner.nextInt();
        switch (inputGenre) {
            case 0:
                return Genre.ACTION;
            case 1:
                return Genre.COMEDY;
            case 2:
                return Genre.DRAMA;
            case 3:
                return Genre.UNKNOWN;
        }
        return input();
    }
}
