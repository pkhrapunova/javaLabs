package lab3.task3_3;

import java.util.Scanner;

public class TVShow extends Movie implements Show {
    private int seasons;
    private int series;
    TVShow(){
        super("",0,Genre.UNKNOWN);
        seasons = 0;
        series = 0;
    }

    TVShow(String name, int year, Genre genre, int seasons, int series){
        super(name, year, genre);
        this.seasons = seasons;
        this.series = series;
    }
    public void setSeasons(int seasons){
        this.seasons=seasons;
    }
    public void setSeries(int series){
        this.series=series;
    }
    public int getSeasons(){
        return seasons;
    }
    public int getSeries(){
        return series;
    }
    public String toString(){
        return "TV show: " + super.toString()+", seasons: " + seasons + ", series: " + series;
    }
    public void scan(){
        Scanner input = new Scanner(System.in);
        super.scan();
        System.out.println("Enter the number of season:");
        this.setSeasons(input.nextInt());
        System.out.println("Enter the number of series:");
        this.setSeries(input.nextInt());
    }
    @Override
    int calculateAge() {
        System.out.print("It was released in: ");
        int age = java.time.Year.now().getValue()- this.getYear();
        if (age < this.seasons) {
            System.out.print("Still running, ");

        }
        return age;
    }

    @Override
    public void print() {
        super.print();
    }
}

