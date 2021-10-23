package inheritance;

import java.util.ArrayList;

public class Theater extends Place {
    private ArrayList<String> allMovies = new ArrayList<String>();
    private String nameMovie;



//    public Theater(String name, double price, double stars) {
//        super(name, price, stars);
//    }
    public Theater(String name, double price, double stars ) {

        super(name, price, stars);

    }

    public ArrayList<String> getAllmovies() {
        return allMovies;
    }

    public void setAllmovies(ArrayList<String> allmovies) {
        this.allMovies = allmovies;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public void addMovie(String newMovie) {
        allMovies.add(newMovie);
    }

    public void removeMovie(String newMovie) {
        allMovies.remove(newMovie);
    }

    public String toString() {
        if (getReviewlist().isEmpty()  ) {
            return ("Theater name is " + getName() + " with start " + getStars() + ",his price " + getPrice() + "$"+"The movies is shown know "+allMovies);
        } else {
            return ("Theater name is " + getName() + " with start " + getStars() + ",his price " + getPrice() + "$"+"The movies is shown know "+allMovies+ getReviewlist());
        }
    }

}

