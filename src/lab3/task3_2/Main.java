package lab3.task3_2;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.scan();
        System.out.println(movie);
        System.out.println(movie.calculateAge());

        Cartoon cartoon = new Cartoon("Toy story",1995,"comedy","3D");
        System.out.println(cartoon);
        System.out.println(cartoon.calculateAge());

        TVShows tvShow = new TVShows("Friends",1994,"comedy",10, 236);
        System.out.println(tvShow);
        System.out.println(tvShow.calculateAge());
    }
}
