/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testnoerror() {
        App checksemicolontest = new App();
        String path ="C:\\Users\\STUDENT\\project\\java-fundamentals\\linter\\resources\\noerror.js";
        String testresult=checksemicolontest.checksemicolon(path);
        assertEquals ("",testresult);
    }

    @Test void testoneerror() {
        App checksemicolontest = new App();
        String path ="C:\\Users\\STUDENT\\project\\java-fundamentals\\linter\\resources\\oneerror.js";
        String testresult=checksemicolontest.checksemicolon(path);
        assertEquals ("Line 5: Missing semicolon.\n",testresult);
    }
    @Test void testofewerror() {
        App checksemicolontest = new App();
        String path ="C:\\Users\\STUDENT\\project\\java-fundamentals\\linter\\resources\\fewerror.js";
        String testresult=checksemicolontest.checksemicolon(path);
        String expected="Line 3: Missing semicolon.\n"+"Line 5: Missing semicolon.\n";
        assertEquals (expected,testresult);
    }
    @Test void testomanyerror() {
        App checksemicolontest = new App();
        String path ="C:\\Users\\STUDENT\\project\\java-fundamentals\\linter\\resources\\manyerror.js";
        String testresult=checksemicolontest.checksemicolon(path);
        String expected=
                "Line 3: Missing semicolon.\n"+
                        "Line 5: Missing semicolon.\n"+
                        "Line 10: Missing semicolon.\n"+
                        "Line 12: Missing semicolon.\n"+
                        "Line 14: Missing semicolon.\n"+
                        "Line 21: Missing semicolon.\n"+
                        "Line 22: Missing semicolon.\n"+
                        "Line 23: Missing semicolon.\n"+
                        "Line 24: Missing semicolon.\n"+
                        "Line 25: Missing semicolon.\n"+
                        "Line 26: Missing semicolon.\n"+
                        "Line 27: Missing semicolon.\n"+
                        "Line 28: Missing semicolon.\n"+
                        "Line 29: Missing semicolon.\n"+
                        "Line 30: Missing semicolon.\n";


        assertEquals (expected,testresult);
    }

    @Test void testempty() {
        App checksemicolontest = new App();
        String path ="C:\\Users\\STUDENT\\project\\java-fundamentals\\linter\\resources\\empty.js";
        String testresult=checksemicolontest.checksemicolon(path);
        assertEquals ("",testresult);
    }
}
