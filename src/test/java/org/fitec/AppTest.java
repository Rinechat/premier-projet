package org.fitec;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public  void shouldReturn5Given2and3(){
        App app =new App();
        assertTrue(app.addition(3,2)==5);
    }

}
