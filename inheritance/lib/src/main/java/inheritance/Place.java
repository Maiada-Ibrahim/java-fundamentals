package inheritance;

import java.util.ArrayList;

public abstract class Place {
   private   String name ;
   private double price;
   private double stars;
   private ArrayList<Review> reviewList = new ArrayList<Review>();

    public Place(String name, double price, double stars) {
        this.name = name;
        this.price = price;
        this.stars = 0;
    }

    public  void addReview  (Review review) {
        reviewList.add(review);
        startAfterReviwe();

    }
    public  void startAfterReviwe  () {
        double sum=0;
        double avarage=0.0;
        for (int i=0; i<reviewList.size();i++){
            sum =sum+reviewList.get(i).getStars();
            avarage =sum/reviewList.size();}

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
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewlist) {
        this.reviewList = reviewlist;
    }


}
