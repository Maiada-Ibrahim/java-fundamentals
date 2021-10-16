/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    //    @Test void testroll() {
//        Library rolltest = new Library();
//        ArrayList<Integer> correctresulte= rolltest.roll(6);
//        assertEquals(6, correctresulte.size());
//    }
//    @Test void testduplicates() {
//        Library duplicatestest = new Library();
//        int[] array = {1, 3, 5, 7, 4};
//        int[] array1 = {1,1, 3, 5, 7, 4};
//
//        boolean correctresulte= duplicatestest. duplicates(array);
//        assertEquals(false, correctresulte);
//        boolean correctresulte1= duplicatestest. duplicates(array1);
//        assertEquals(true, correctresulte1);
//
//    }
//    @Test void testaverages() {
//        Library averagestest = new Library();
//        int[] avrgarray = {1, 3, 5, 7, 4};
//        double correctresulte= averagestest.averages(avrgarray);
//        assertEquals(4.0, correctresulte);
//    }
//    @Test void testavarageoftwoarray() {
//        Library avarageoftwoarraytest = new Library();
//        int[][] weeklyMonthTemperatures = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//        int[] correctresulte= avarageoftwoarraytest.avarageoftwoarray(weeklyMonthTemperatures);
//        int[] expect={55, 54, 60, 53, 59, 57, 61};
//        assertArrayEquals(expect, correctresulte);
//    }
//------------------------------lab-03------------------------------
    @Test void testweather() {
        Library weathertest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String correctresulte= weathertest.weather(weeklyMonthTemperatures);
        String expect = "\nNever saw temperature:63" +
                "\nNever saw temperature:67" +
                "\nNever saw temperature:68" +
                "\nNever saw temperature:69";


        assertEquals (expect, correctresulte);
    }
    @Test void testtally() {
        Library tallytest = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        assertEquals("Bush",tallytest.tally(votes));
        ;


    }
}