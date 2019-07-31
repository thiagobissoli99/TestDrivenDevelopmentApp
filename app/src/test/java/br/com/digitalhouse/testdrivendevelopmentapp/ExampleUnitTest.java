package br.com.digitalhouse.testdrivendevelopmentapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void invertePalavra_isCorrect() {
        MainActivity mainActivity = new MainActivity();
        String palavra = "abc";

        assertEquals("cba", mainActivity.invertePalavra(palavra));
    }
}