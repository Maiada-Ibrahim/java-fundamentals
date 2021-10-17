package inheritance;

import java.util.ArrayList;


public class Restaurant {
    String name;
    double stars ;
    double price;

    public Restaurant(String name, double stars, double price) {
        this.name = name;
        this.price = price;
        if(stars<0|| stars>5 ){
            this.stars = 0;
        }else{
            this.stars=stars;
        }
    }
    ArrayList<Review> reviewlist = new ArrayList<Review>();
    public  void addReview  (Review review) {
        reviewlist.add(review);
        startafterreviwe();
    }
    public  void startafterreviwe  () {
        double sum=0;
        double avarage=0.0;
        for (int i=0; i<reviewlist.size();i++){
        sum =sum+reviewlist.get(i).stars;
         avarage =sum/reviewlist.size();}

        this.stars=avarage;
    }
    public  String toString (){
//        ArrayList<Review> reviewlist2 = new ArrayList<Review>();
        if (reviewlist.isEmpty()){
     return    ("Restaurant name is " +name+ " with start "+ stars +",his price "+ price);
        }else {
            return    ("Restaurant name is " +name+ " with start "+ stars +",his price "+ price + reviewlist   );
        }
}
}