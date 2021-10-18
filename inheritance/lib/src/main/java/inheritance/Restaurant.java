package inheritance;

import java.util.ArrayList;


public class Restaurant extends  Place{
    public Restaurant(String name, double stars, double price) {
        super(name, stars, price);
    }
    public  String toString (){
        if (getReviewlist().isEmpty()){
     return    ("Restaurant name is " +getName()+ " with start "+ getStars() +",his price "+ getPrice()+"$");
        }else {
            return    ("Restaurant name is " +getName()+ " with start "+ getStars() +",his price "+ getPrice() +"$"+ getReviewlist()   );
        }
}
}