package lab3.task3_1;

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
    Movie(String name,int year,String genre){
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
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        return "name: " + name + " , year: " + year+ " , genre: "+genre;

    }
    public void scan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the movie:");
        this.setName(input.nextLine());
        System.out.println("Enter the year of the movie:");
        this.setYear(input.nextInt());
        input.nextLine();
        System.out.println("Enter the genre of the movie:");
        this.setGenre(input.nextLine());
    }
}
