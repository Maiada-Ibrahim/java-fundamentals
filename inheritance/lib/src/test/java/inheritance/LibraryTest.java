/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void RestTest() {
        Restaurant TestRest = new Restaurant("mac", 4, 5.5);
        String correctresulte= TestRest.toString();
        String expect = "Restaurant name is mac with start 4.0,his price 5.5";
        assertEquals (expect, correctresulte);
    }
    @Test void RevTest() {
        Review TestRev = new Review("GOOD", "Maicle", 4);
        String correctresulte= TestRev.toString();
        String expect = "Review body is GOOD his author Maicle with start 4";
        assertEquals (expect, correctresulte);
    }
    @Test void RestTestAfterAdd() {
        Restaurant RestTestAfterAdd = new Restaurant("mac", 4, 5.5);
        Review review= new Review("GOOD", "Maicle", 4);
        RestTestAfterAdd.addReview(review);
        String correctresulte= RestTestAfterAdd.toString();
        String expect = "Restaurant name is mac with start 4.0,his price 5.5[Review body is GOOD his author Maicle with start 4]";
        assertEquals (expect, correctresulte);
    }

}