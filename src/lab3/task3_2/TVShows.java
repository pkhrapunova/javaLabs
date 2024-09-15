package lab3.task3_2;

import java.util.Scanner;
public class TVShows extends Movie {
    private int seasons;
    private int series;
    TVShows(){
        this.seasons = 0;
        this.series = 0;
    }
    TVShows(String name,int year,String genre,int seasons, int series){
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
    public int calculateAge() {
        int age = super.calculateAge();
        if (age < this.seasons) {
            System.out.print("Still running, ");

        }
        return age;

    }

}
