/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Review review= new Review("GOOD", "Maicle", 4);
        Review review2= new Review("bad", "tala", "goooog",5);
        Review review3= new Review("bad", "tala", 5,"Game of throne");

        Restaurant mac = new Restaurant("mac", 4, 5.5);
        mac.addReview(review);
//        System.out.println(mac.toString());
//        System.out.println(review.toString());
//        System.out.println(review2.toString());
//        mac.addReview(review);
//        mac.addReview(review2);
//        System.out.println(mac.toString());
//          Shop lafamilia =new Shop("lafamilia",30,20,"GOOD");
//          lafamilia.addReview(review2);
//          System.out.println(lafamilia.toString());
//Place place=new Restaurant("mac", 4, 5.5);
//                place.addReview(review);
//                System.out.println(place.toString());
//        Place place2=new Shop("LA", 4, 4.5,"jjjjjjjjjj");
//        place2.addReview(review2);
//        System.out.println(place2.toString());
        Theater place3=new Theater("city mall",30,5);
        place3.addReview(review3);
//        place3.addMovie("llllllllllllllllllllllllll");
        place3.addMovie("Game of throne");

//        place3.addMovie("kkkkkkkkkk");
//        place3.removeMovie("llllllllllllllllllllllllll");
        System.out.println(place3.toString());
    }
}
