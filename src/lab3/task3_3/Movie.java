package lab3.task3_3;

import java.util.Scanner;

public abstract class Movie  {
    private String name;
    private int year;
    private Genre genre;

    Movie(){
        name = "";
        year = 0;
        genre = Genre.UNKNOWN;
    }
    Movie(String name, int year,Genre genre){
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
    public String getName(){
        return  this.name;
    }
    public int getYear(){
        return this.year;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }
    public Genre getGenre(){
        return this.genre;
    }
    public String toString(){
        return "name: " + name + ", year: " + year+ ", genre: "+genre;
    }

    public void print(){
        System.out.println(this);
    }
    public void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        this.setName(scanner.nextLine());
        System.out.println("Enter the year");
        this.setYear(scanner.nextInt());
        scanner.nextLine();
        this.genre = genre.input();
    }

    abstract int calculateAge();

}
