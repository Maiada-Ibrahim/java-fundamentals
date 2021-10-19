package inheritance;

import java.util.ArrayList;

public class Theater extends Place {
    private ArrayList<String> allmovies = new ArrayList<String>();
    private String nameMovie;



//    public Theater(String name, double price, double stars) {
//        super(name, price, stars);
//    }
    public Theater(String name, double price, double stars ) {

        super(name, price, stars);

    }

    public ArrayList<String> getAllmovies() {
        return allmovies;
    }

    public void setAllmovies(ArrayList<String> allmovies) {
        this.allmovies = allmovies;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public void addMovie(String newMovie) {
        allmovies.add(newMovie);
    }

    public void removeMovie(String newMovie) {
        allmovies.remove(newMovie);
    }

    public String toString() {
        if (getReviewlist().isEmpty()  ) {
            return ("Theater name is " + getName() + " with start " + getStars() + ",his price " + getPrice() + "$"+"The movies is shown know "+allmovies);
        } else {
            return ("Theater name is " + getName() + " with start " + getStars() + ",his price " + getPrice() + "$"+"The movies is shown know "+allmovies+ getReviewlist());
        }
    }

}

