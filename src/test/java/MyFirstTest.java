import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;


public class MyFirstTest {
    @Before
    public void setup(){
        String codeup = "Codeup";
    }

    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.sum(input1, input2));
    }
    @Test
    public void testTipCalculator(){
        double price = 10;
        double percentage = 20;
        int tip = 2;

        assertEquals(tip, Calculator.tipCalculator(price,percentage), 0.01);
    }

//    @Test
//    public void testCodeup(){
//        String codeup = "Codeup";
//        setup();
//        assertEquals(codeup, "codeup");
//    }

    @Test
    public void arrayTester(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

}
