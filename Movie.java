import java.util.ArrayList;

class Movie {
    String title, genre;
    int duration;
    double rating;

    public Movie(String title, String genre, int duration, double rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 148, 8.8));
        movies.add(new Movie("The Dark Knight", "Action", 152, 9.0));
        movies.add(new Movie("Interstellar", "Sci-Fi", 169, 8.6));

        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }
}