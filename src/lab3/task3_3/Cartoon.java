package lab3.task3_3;

import java.util.Scanner;

public class Cartoon extends Movie implements Show{
    private String typeGraphic;
    Cartoon(){
        super("",0,Genre.UNKNOWN);
        typeGraphic = "";
    }
    Cartoon(String name, int year, Genre genre, String typeGraphic){
        super(name, year, genre);
        this.typeGraphic = typeGraphic;
    }

    public void setTypeGraphic(String typeGraphic){
        this.typeGraphic= typeGraphic;
    }
    public String getTypeGraphic(){
        return typeGraphic;
    }
    public String toString(){
        return "Cartoon: " + super.toString()+", typeGraphic: " + typeGraphic ;
    }
    public void scan(){
        Scanner input = new Scanner(System.in);
        super.scan();
        System.out.println("Enter the type of graphics:");
        this.setTypeGraphic(input.nextLine());
    }

    @Override
    public void print() {
        super.print();
    }

    public int calculateAge() {
        System.out.print("It was released in: ");
        int age = java.time.Year.now().getValue()- this.getYear();
        if (this.typeGraphic.equals("3D")){
            System.out.print("Released after 1995, ");
        }
        return age;
    }

}
