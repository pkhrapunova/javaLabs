package lab3.task3_2;

import java.util.Scanner;

public class Movie {
    private String name;
    private int year;
    private String genre;

    Movie(){
        name = "";
        year = 0;
        genre = "";
    }
    Movie(String name, int year, String genre){
        this.name = name;
        this.year = year;
        this.genre = genre;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getName(){
        return  this.name;
    }
    public int getYear(){
        return this.year;
    }
    public String getGenre(){
        return  this.genre;
    }
    public String toString(){
        return "name: " + name + ", year: " + year+ ", genre: "+genre;

    }
    public void scan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        this.setName(input.nextLine());
        System.out.println("Enter the year");
        this.setYear(input.nextInt());
        input.nextLine();
        System.out.println("Enter the genre");
        this.setGenre(input.nextLine());
    }

    public int calculateAge() {
        System.out.print("It was released in: ");
        int currentYear = java.time.Year.now().getValue();
        return  currentYear - this.year;
    }

}
