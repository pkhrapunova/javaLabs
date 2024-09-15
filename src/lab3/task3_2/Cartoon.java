package lab3.task3_2;
import java.util.Objects;
import java.util.Scanner;

public class Cartoon extends Movie {
    private String typeGraphic;
    Cartoon(){
        typeGraphic = "";
    }
    Cartoon(String name,int year,String genre,String typeGraphic){
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

    public int calculateAge() {
        int age = super.calculateAge();
        if (this.typeGraphic.equals("3D")){
            System.out.print("Released after 1995, ");
        }
        return age;
    }

}
