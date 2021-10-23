package inheritancelab6;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double stars;
    private double price;

//    public Restaurant(){
//        this.stars=0;
//
//    }

    public Restaurant(String name, double stars, double price) {
        this.name = name;
        this.price = price;
        this.stars=0;
//        if (stars < 0 || stars > 5) {
//            this.stars = 0;
//
//        } else  {
//            this.stars = stars;
//        }
    }

    private ArrayList<Review> reviewList = new ArrayList<Review>();

    public void addReview(Review review) {
        reviewList.add(review);
        startAfterReviwe();
    }

    public void startAfterReviwe() {
        double sum = 0;
        double avarage = 0.0;
        for (int i = 0; i < reviewList.size(); i++) {
            sum = sum + reviewList.get(i).stars;
            avarage = sum / reviewList.size();
        }


        this.stars = avarage;
    }

    public String toString() {
//        ArrayList<Review> reviewlist2 = new ArrayList<Review>();
        if (reviewList.isEmpty()) {
            return ("Restaurant name is " + name + " with start " + stars + ",his price " + price + "$");
        } else {
            return ("Restaurant name is " + name + " with start " + stars + ",his price " + price + "$" + reviewList);
        }

    }
}