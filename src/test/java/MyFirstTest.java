import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


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

//    @Test
//    public void arrayTester(){
//        List<String> languages = new ArrayList<>();
//        List<String> moreLanguages = new ArrayList<>();
//        assertNotSame(languages, moreLanguages);
//    }

//    @Test
//    public void assertArrayEquals(int[] arr1, int[] arr2){
//        int[] numbers = {1, 2, 3};
//        int[] otherNumbers = new int[3];
//        otherNumbers[0] = 1;
//        otherNumbers[1] = 2;
//        otherNumbers[2] = 3;
//        assertArrayEquals(numbers, otherNumbers);
//    }

    @Test
    public void assertTrueFalse(){
        String language = "PHP";
        assertTrue(language.contains("H"));  // use assertTrue for this statement
        assertFalse(language.contains("J")); ; // use assertFalse for this statement
    }
}
