/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritancelab6;

public class Library {
    public static void main(String[] args) {
        Restaurant mac = new Restaurant("mac", 4, 5.5);
        System.out.println(mac.toString());


        Review review= new Review("GOOD", "Maicle", 4);
        Review review5= new Review("GOOD", "Maicle", 3);

        System.out.println(review.toString());
//        Review review2= new Review("bad", "tala", 5);
//        System.out.println(review2.toString());
        mac.addReview(review);
        mac.addReview(review5);
//        mac.addReview(review2);
        System.out.println(mac.toString());
    }

}