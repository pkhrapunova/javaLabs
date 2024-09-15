package lab3.task3_1;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("Barbie",2023,"comedy");
        m1.scan();
        m2.setYear(2024);
        System.out.println(m2.getYear());
        System.out.println(m1);
        System.out.println(m2);
    }
}
