package inheritance;

import java.util.ArrayList;

public abstract class Place {
   private   String name ;
   private double price;
   private double stars;
   private ArrayList<Review> reviewlist = new ArrayList<Review>();

    public Place(String name, double price, double stars) {
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    public  void addReview  (Review review) {
        reviewlist.add(review);
        startAfterReviwe();

    }
    public  void startAfterReviwe  () {
        double sum=0;
        double avarage=0.0;
        for (int i=0; i<reviewlist.size();i++){
            sum =sum+reviewlist.get(i).getStars();
            avarage =sum/reviewlist.size();}

        this.stars=avarage;
    }
    abstract public String toString();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviewlist() {
        return reviewlist;
    }

    public void setReviewlist(ArrayList<Review> reviewlist) {
        this.reviewlist = reviewlist;
    }
//public void choose(Place ch){
//    ch.toString();
//}

}
