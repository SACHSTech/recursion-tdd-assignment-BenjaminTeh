package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest {
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }

    @Test
    public void Test1(){
        assertEquals(2, Recursion.count7(717));
    }
    @Test
    public void Test2(){
        assertEquals(1, Recursion.count7(7));
    }
    @Test
    public void Test3(){
        assertEquals(0, Recursion.count7(123));
    }
    @Test
    public void Test4(){
        assertEquals(-1, Recursion.count7(-1));
    }
    @Test
    public void Test5(){
        assertEquals("hel*lo", Recursion.pairStar("hello"));
    }
    @Test
    public void Test6(){
        assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
    }
    @Test
    public void Test7(){
        assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
    }
    @Test
    public void Test8(){
        assertEquals("", Recursion.pairStar(""));
    }
    @Test
    public void Test9(){
        assertEquals("yza", Recursion.stringClean("yyzzza"));
    }
    @Test
    public void Test10(){
        assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    }

    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }


}
