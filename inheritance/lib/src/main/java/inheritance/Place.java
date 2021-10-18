package inheritance;

import java.util.ArrayList;

public abstract class Place {
  private   String name ;
   private double stars;
   private double price;

    public String getName() {
        return name;
    }

    public ArrayList<Review> getReviewlist() {
        return reviewlist;
    }

    public void setReviewlist(ArrayList<Review> reviewlist) {
        this.reviewlist = reviewlist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Place(String name, double stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        if(stars<0|| stars>5 ) {
            this.stars = 0;

        }else{
            this.stars=stars;
        }

    }

    private ArrayList<Review> reviewlist = new ArrayList<Review>();
    public  void addReview  (Review review) {
        reviewlist.add(review);
        startafterreviwe();
    }
    public  void startafterreviwe  () {
        double sum=0;
        double avarage=0.0;
        for (int i=0; i<reviewlist.size();i++){
            sum =sum+reviewlist.get(i).getStars();
            avarage =sum/reviewlist.size();}

        this.stars=avarage;
    }



}
