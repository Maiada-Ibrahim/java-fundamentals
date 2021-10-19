package inheritance;

import java.util.ArrayList;


public class Restaurant extends  Place{


    public Restaurant(String name, double price, double stars) {
        super(name, price,stars);

    }

    public  String toString (){
        if (getReviewlist().isEmpty()){
     return    ("Restaurant name is " +getName()+ " with start "+ this.getStars() +",his price "+ getPrice()+"$");
        }else {
            return    ("Restaurant name is " +getName()+ " with start "+ this.getStars() +",his price "+ getPrice() +"$"+getReviewlist()  );
        }
}
}