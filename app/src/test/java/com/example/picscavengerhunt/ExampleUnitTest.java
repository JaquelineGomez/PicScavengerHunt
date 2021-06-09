package com.example.picscavengerhunt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void pointsDecimal()
    {
        gameScreen.setPoints((long)0.1);
        long pointDecimal=gameScreen.getPoints();
        assertEquals(pointDecimal,(long)0.1);
    }

    @Test
    public void pointsZero()
    {
        gameScreen.setPoints((long)0.0);
        long pointZero=gameScreen.getPoints();
        assertEquals(pointZero,(long)0.0);
    }

    @Test
    public void pointsNegative()
    {
        gameScreen.setPoints((long)-1.0);
        long pointZero=gameScreen.getPoints();
        assertEquals(pointZero,(long)0.0);
    }

    @Test
    public void password()
    {
        MainActivity.setPassword("3x=");
        //assertEquals("3x=",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordNoNum() {
        MainActivity.setPassword("Xy*");
        //assertEquals("Xy*",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordNoLetters() {
        MainActivity.setPassword("998*");
        //assertEquals("998*",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordNoSpecialCharacter() {
        MainActivity.setPassword("9A");
        //assertEquals("9A",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordOtherCharacter_dash()
    {
        MainActivity.setPassword("3x-");
        //assertEquals("3x-",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordOtherCharacter_quote()
    {
        MainActivity.setPassword("3x\"");
        //assertEquals("3x\"",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordUpperNumAndAsterisk()
    {
        MainActivity.setPassword("A9*");
        //assertEquals("A9*",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordLowerNumAndAsterisk()
    {
        MainActivity.setPassword("a9*");
        //assertEquals("a9*",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndExclamation()
    {
        MainActivity.setPassword("3x!");
        //assertEquals("3x!",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndAtSign()
    {
        MainActivity.setPassword("3x@");
        //assertEquals("3x@",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndHashtag()
    {
        MainActivity.setPassword("3x#");
        //assertEquals("3x#",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndSign()
    {
        MainActivity.setPassword("3x&");
        //assertEquals("3x&",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndParenthesis()
    {
        MainActivity.setPassword("3x()");
        //assertEquals("3x()",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndUnderscore()
    {
        MainActivity.setPassword("3x_");
        //assertEquals("3x_",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndCurlyBrackets()
    {
        MainActivity.setPassword("3x{}");
        //assertEquals("3x{}",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndColon()
    {
        MainActivity.setPassword("3x:");
        //assertEquals("3x:",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndSemiColon()
    {
        MainActivity.setPassword("3x;");
        //assertEquals("3x;",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordLowerNumAndApostrophe()
    {
        MainActivity.setPassword("3x'");
        //assertEquals("3x'",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndComma()
    {
        MainActivity.setPassword("3x,");
        //assertEquals("3x,",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndQuestionMark()
    {
        MainActivity.setPassword("3x?");
        //assertEquals("3x?",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    public void passwordLowerNumAndFrontSlash()
    {
        MainActivity.setPassword("3x/");
        //assertEquals("3x/",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndBackSlash()
    {
        MainActivity.setPassword("3x\\");
        //assertEquals("3x\\",MainActivity.getPassword());
        assertFalse(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndTilde()
    {
        MainActivity.setPassword("3x~");
        //assertEquals("3x~",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndDollarSign()
    {
        MainActivity.setPassword("3x$");
        //assertEquals("3x$",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndPlusSign()
    {
        MainActivity.setPassword("3x+");
        //assertEquals("3x+",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndLessThanSign()
    {
        MainActivity.setPassword("3x<");
        //assertEquals("3x<",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndGreaterThanSign()
    {
        MainActivity.setPassword("3x>");
        //assertEquals("3x>",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndEqualThanSign()
    {
        MainActivity.setPassword("3x=");
        //assertEquals("3x=",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    public void passwordLowerNumAndCaret()
    {
        MainActivity.setPassword("3x^");
        //assertEquals("3x^",MainActivity.getPassword());
        assertTrue(MainActivity.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
}
